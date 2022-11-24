// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.language;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@upe
public class AppLanguageSettingsPresenter$SavedState<OBJ extends AppLanguageSettingsPresenter> extends eq1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new AppLanguageSettingsPresenter$SavedState$a();
    }
    
    public AppLanguageSettingsPresenter$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public AppLanguageSettingsPresenter$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final rmp rmp, final OBJ obj) throws IOException, ClassNotFoundException {
        final AppLanguageSettingsPresenter appLanguageSettingsPresenter = (AppLanguageSettingsPresenter)super.deserializeValue(rmp, (Object)obj);
        appLanguageSettingsPresenter.g = rmp.u();
        return (OBJ)appLanguageSettingsPresenter;
    }
    
    public /* bridge */ Object deserializeValue(final rmp rmp, final Object o) throws IOException, ClassNotFoundException {
        return this.deserializeValue(rmp, (AppLanguageSettingsPresenter)o);
    }
    
    public void serializeValue(final smp smp, final OBJ obj) throws IOException {
        super.serializeValue(smp, (Object)obj);
        smp.t(obj.g);
    }
    
    public /* bridge */ void serializeValue(final smp smp, final Object o) throws IOException {
        this.serializeValue(smp, (AppLanguageSettingsPresenter)o);
    }
}
