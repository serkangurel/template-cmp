package di

import org.koin.core.module.Module
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module
import ui.screens.home.HomeScreenModel

expect fun sharedPlatformModule(): Module

val commonModule = module {
    factoryOf(::HomeScreenModel)
}