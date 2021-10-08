package com.forgesandbox.core;

import net.minecraftforge.fml.common.Mod;

import com.forgesandbox.common.Register;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("forgesandbox")
public class Entry{
    private static final String MOD_ID = "forgesandbox";

    public static final Logger LOGGER = LogManager.getLogger();

    public Entry() {
        LOGGER.info("NOTE::Enterred ForgeSandbox1.17.x");

        Register.registerRegistries();
    }

    public static String getMOD_ID(){
        return MOD_ID;
    }
}
