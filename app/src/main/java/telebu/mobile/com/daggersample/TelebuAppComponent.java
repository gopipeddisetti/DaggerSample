package telebu.mobile.com.daggersample;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by Gopi Krishna on 7/30/2019.
 */
@Component(modules = {AndroidInjectionModule.class,TelebuModule.class,TelebuActivityModule.class})
@Singleton
public interface TelebuAppComponent {

    //AndroidInjectionModule.class is default and mandatory module

    /* We will call this builder interface from our custom Application class.
     * This will set our application object to the AppComponent.
     * So inside the AppComponent the application instance is available.
     * So this application instance can be accessed by our modules
     * such as ApiModule when needed
     * */
    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(TelebuApplication application);
        TelebuAppComponent build();

    }

     /* * This is our custom Application class
     * */

    void inject(TelebuApplication telebuApplication);
}
