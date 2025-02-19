package io.reflekt.plugin.utils

import io.reflekt.cli.Util.PLUGIN_ID
import org.jetbrains.kotlin.config.CompilerConfigurationKey
import java.io.File

internal object Keys {
    val OUTPUT_DIR = CompilerConfigurationKey<File>("$PLUGIN_ID.outputDir")
    val ENABLED = CompilerConfigurationKey<Boolean>("$PLUGIN_ID.enabled")
    val INTROSPECT_FILES = CompilerConfigurationKey<List<File>>("$PLUGIN_ID.introspectFiles")
}
