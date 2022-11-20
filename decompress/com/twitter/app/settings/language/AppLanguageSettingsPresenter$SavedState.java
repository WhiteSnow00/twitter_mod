// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.language;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@xoe
public class AppLanguageSettingsPresenter$SavedState<OBJ extends AppLanguageSettingsPresenter> extends zp1<OBJ>
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
    
    public OBJ deserializeValue(final vlp vlp, final OBJ obj) throws IOException, ClassNotFoundException {
        final AppLanguageSettingsPresenter appLanguageSettingsPresenter = (AppLanguageSettingsPresenter)super.deserializeValue(vlp, (Object)obj);
        appLanguageSettingsPresenter.g = vlp.s();
        return (OBJ)appLanguageSettingsPresenter;
    }
    
    public /* bridge */ Object deserializeValue(final vlp vlp, final Object o) throws IOException, ClassNotFoundException {
        return this.deserializeValue(vlp, (AppLanguageSettingsPresenter)o);
    }
    
    public void serializeValue(final wlp wlp, final OBJ obj) throws IOException {
        super.serializeValue(wlp, (Object)obj);
        wlp.r(obj.g);
    }
    
    public /* bridge */ void serializeValue(final wlp wlp, final Object o) throws IOException {
        this.serializeValue(wlp, (AppLanguageSettingsPresenter)o);
    }
}
