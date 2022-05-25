package dev.jai.billgenerator.di.module

import com.example.appstarter_mvvm_databinding_di_retrofit.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.jai.billgenerator.di.annotaton.ActivityScope

@Module
interface ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector()
    fun contributeMainActivity(): MainActivity
}