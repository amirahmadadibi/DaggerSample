package net.codeinreal.amriahmadadibi.projects.samples.daggersmaple.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import net.codeinreal.amriahmadadibi.projects.samples.daggersmaple.BaseApplication

/**
 * Created by Amirahmad Adibi.
 * DaggerSmaple | Copyrights 2020-01-25.
 */
//that tells dagger this is dagger this is a component
//appcomponent -> service baseApplication -> client

@Component(modules = arrayOf(AndroidSupportInjectionModule::class))
interface AppComponent : AndroidInjector<BaseApplication> {
    //BaseApplication gonna be the client of this component
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}