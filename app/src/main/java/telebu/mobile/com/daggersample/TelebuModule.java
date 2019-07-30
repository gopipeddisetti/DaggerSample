package telebu.mobile.com.daggersample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Gopi Krishna on 7/30/2019.
 */

@Module
public class TelebuModule {

    @Provides
    @Singleton
    TelebuModel myTelebuModel(){
        return new TelebuModel();
    }
}
