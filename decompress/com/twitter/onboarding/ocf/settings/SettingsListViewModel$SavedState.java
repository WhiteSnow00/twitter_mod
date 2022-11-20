// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.ocf.settings;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@xoe
public class SettingsListViewModel$SavedState<OBJ extends SettingsListViewModel> extends AbstractSettingsViewModel$SavedState<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new SettingsListViewModel$SavedState$a();
    }
    
    public SettingsListViewModel$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public SettingsListViewModel$SavedState(final OBJ obj) {
        super((AbstractSettingsViewModel)obj);
    }
    
    public /* bridge */ AbstractSettingsViewModel deserializeValue(final vlp vlp, final AbstractSettingsViewModel abstractSettingsViewModel) throws IOException, ClassNotFoundException {
        return this.deserializeValue(vlp, abstractSettingsViewModel);
    }
    
    public OBJ deserializeValue(final vlp vlp, final OBJ obj) throws IOException, ClassNotFoundException {
        final SettingsListViewModel settingsListViewModel = (SettingsListViewModel)super.deserializeValue(vlp, (AbstractSettingsViewModel)obj);
        settingsListViewModel.e = vlp.s();
        return (OBJ)settingsListViewModel;
    }
    
    public /* bridge */ Object deserializeValue(final vlp vlp, final Object o) throws IOException, ClassNotFoundException {
        return this.deserializeValue(vlp, (SettingsListViewModel)o);
    }
    
    public /* bridge */ void serializeValue(final wlp wlp, final AbstractSettingsViewModel abstractSettingsViewModel) throws IOException {
        this.serializeValue(wlp, (SettingsListViewModel)abstractSettingsViewModel);
    }
    
    public void serializeValue(final wlp wlp, final OBJ obj) throws IOException {
        super.serializeValue(wlp, (AbstractSettingsViewModel)obj);
        wlp.r(obj.e);
    }
    
    public /* bridge */ void serializeValue(final wlp wlp, final Object o) throws IOException {
        this.serializeValue(wlp, (SettingsListViewModel)o);
    }
}
