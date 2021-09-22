package com.forgesandbox.common.objects.SlimeVariant;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HalfTransparentBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.Vec3;

public class SlimeVariantBlock extends HalfTransparentBlock{
   public static final String[] slimeIDS = {"slimevariantblock1", "slimevariantblock2", "slimevariantblock3"};
   public static final double[] addedSprings = {0.2 * (1/3), 0.2 * (2/3), 0.2 * (3/3)};

   public int slimeVariantNum;

   public static boolean logInfo = false;

   public SlimeVariantBlock(int slimeVariantNum) {
      super(Block.Properties.of(Material.CLAY).jumpFactor(1f + (float)addedSprings[slimeVariantNum]));

      this.slimeVariantNum = slimeVariantNum;
   }

   public void fallOn(Level level, BlockState blockState, BlockPos blockPos, Entity entity, float ukfloat) {
      if(logInfo)
         LOGGER.info("fallOn(Level level, BlockState blockState, BlockPos blockPos, Entity entity, float ukfloat)");

      if (entity.isSuppressingBounce())
         super.fallOn(level, blockState, blockPos, entity, ukfloat);
      else
         entity.causeFallDamage(ukfloat, 0.0F, DamageSource.FALL);
   }
  
   public void updateEntityAfterFallOn(BlockGetter blockGetter, Entity entity) {
      if(logInfo)
         LOGGER.info("updateEntityAfterFallOn(BlockGetter blockGetter, Entity entity)");

      if (entity.isSuppressingBounce()) 
         super.updateEntityAfterFallOn(blockGetter, entity);
      else
         this.bounceUp(entity);
   }
  
   private void bounceUp(Entity entity) {
      if(logInfo)
         LOGGER.info("bounceUp(Entity entity)");

      Vec3 vec3 = entity.getDeltaMovement();

      if (vec3.y < 0.0D) {
         double d0 = entity instanceof LivingEntity ? 1.0D + addedSprings[slimeVariantNum]: 0.8D + addedSprings[slimeVariantNum];
         double yFinalVel = -vec3.y * d0;

         entity.setDeltaMovement(vec3.x, yFinalVel, vec3.z);
      }
   }
  
   public void stepOn(Level level, BlockPos BlockPos, BlockState blockState, Entity entity) {
      if(logInfo)
         LOGGER.info("stepOn(Level level, BlockPos BlockPos, BlockState blockState, Entity entity)");

      double d0 = Math.abs(entity.getDeltaMovement().y);

      if (d0 < 0.1D && !entity.isSteppingCarefully()) {
         double d1 = 0.4D + d0 * 0.2D;
         entity.setDeltaMovement(entity.getDeltaMovement().multiply(d1, 1.0D, d1));
      }
  
      super.stepOn(level, BlockPos, blockState, entity);
   }
}
