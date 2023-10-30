package com.application.moviesapp.di

import com.application.moviesapp.data.repository.AuthRepository
import com.application.moviesapp.data.repository.AuthRepositoryImpl
import com.application.moviesapp.data.repository.FacebookRepositoryImpl
import com.application.moviesapp.data.repository.GoogleRepositoryImpl
import com.application.moviesapp.data.repository.MoviesRepository
import com.application.moviesapp.data.repository.MoviesRepositoryImpl
import com.application.moviesapp.data.repository.SettingsPreferenceImpl
import com.application.moviesapp.data.repository.SettingsPreferenceRepository
import com.application.moviesapp.data.repository.SignInEmailRepositoryImpl
import com.application.moviesapp.data.repository.SignUpEmailRepositoryImpl
import com.application.moviesapp.data.repository.UserPreferenceRepoImpl
import com.application.moviesapp.data.repository.UserPreferenceRepository
import com.application.moviesapp.data.repository.YoutubeRepository
import com.application.moviesapp.data.repository.YoutubeRepositoryImpl
import com.application.moviesapp.domain.model.SettingsPreference
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun providesMoviesRepositoryImpl(moviesRepositoryImpl: MoviesRepositoryImpl): MoviesRepository

    @Binds
    abstract fun providesUserPreferencesRepositoryImpl(userPreferenceRepoImpl: UserPreferenceRepoImpl): UserPreferenceRepository

    //Google
    @Binds
    @Named("GoogleRepo")
    abstract fun providesGoogleRepoImpl(googleRepoImpl: GoogleRepositoryImpl): AuthRepository

    //Github
    @Binds
    @Named("GithubRepo")
    abstract fun providesGithubRepoImpl(authRepoImpl: AuthRepositoryImpl): AuthRepository

    //Facebook
    @Binds
    @Named("FacebookRepo")
    abstract fun providesFacebookRepoImpl(facebookRepoImpl: FacebookRepositoryImpl): AuthRepository

    //Email
    @Binds
    @Named("SignInEmailRepo")
    abstract fun providesSignInEmailRepoImpl(signInEmailRepoImpl: SignInEmailRepositoryImpl): AuthRepository

    @Binds
    @Named("SignUpEmailRepo")
    abstract fun providesSignUpEmailRepoImpl(signUpEmailRepoImpl: SignUpEmailRepositoryImpl): AuthRepository

    @Binds
    abstract fun providesYoutubeRepositoryImpl(youtubeRepositoryImpl: YoutubeRepositoryImpl): YoutubeRepository

    @Binds
    abstract fun providesSettingsRepositoryImpl(settingPreferenceRepoImpl: SettingsPreferenceImpl): SettingsPreferenceRepository

}