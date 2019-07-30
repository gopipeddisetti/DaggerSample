package telebu.mobile.com.daggersample;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Gopi Krishna on 7/30/2019.
 */

@Module
public abstract class TelebuActivityModule {

    @ContributesAndroidInjector()
    abstract TelebuActivityOne contributeTelebuActivityOne();

    @ContributesAndroidInjector()
    abstract TelebuActivityTwo contributeTelebuActivityTwo();
}