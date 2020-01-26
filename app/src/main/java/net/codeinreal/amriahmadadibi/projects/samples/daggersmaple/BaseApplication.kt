package net.codeinreal.amriahmadadibi.projects.samples.daggersmaple

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import net.codeinreal.amriahmadadibi.projects.samples.daggersmaple.di.DaggerAppComponent

/**
 * Created by Amirahmad Adibi.
 * DaggerSmaple | Copyrights 2020-01-25.
 */

class BaseApplication
 : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }


}