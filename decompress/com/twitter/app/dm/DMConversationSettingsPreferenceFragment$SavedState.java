// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@lpe
public class DMConversationSettingsPreferenceFragment$SavedState<OBJ extends DMConversationSettingsPreferenceFragment> extends dq1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new DMConversationSettingsPreferenceFragment$SavedState$a();
    }
    
    public DMConversationSettingsPreferenceFragment$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public DMConversationSettingsPreferenceFragment$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final elp elp, final OBJ obj) throws IOException, ClassNotFoundException {
        final DMConversationSettingsPreferenceFragment dmConversationSettingsPreferenceFragment = (DMConversationSettingsPreferenceFragment)super.deserializeValue(elp, (Object)obj);
        dmConversationSettingsPreferenceFragment.b2 = elp.z();
        dmConversationSettingsPreferenceFragment.X1 = (jp7)((s4j)jp7.w).a(elp);
        dmConversationSettingsPreferenceFragment.Y1 = (long[])((s4j)hx6.l).a(elp);
        dmConversationSettingsPreferenceFragment.Z1 = (hfv)((s4j)hfv.M1).a(elp);
        dmConversationSettingsPreferenceFragment.a2 = (zwj)((s4j)zwj.L0).a(elp);
        dmConversationSettingsPreferenceFragment.c2 = elp.u();
        dmConversationSettingsPreferenceFragment.d2 = elp.u();
        dmConversationSettingsPreferenceFragment.e2 = elp.u();
        dmConversationSettingsPreferenceFragment.f2 = elp.u();
        dmConversationSettingsPreferenceFragment.g2 = elp.u();
        dmConversationSettingsPreferenceFragment.h2 = elp.A();
        return (OBJ)dmConversationSettingsPreferenceFragment;
    }
    
    public void serializeValue(final flp flp, final OBJ obj) throws IOException {
        super.serializeValue(flp, (Object)obj);
        flp.z(obj.b2);
        flp.C((Object)obj.X1, (alp)jp7.w);
        flp.C((Object)obj.Y1, (alp)hx6.l);
        flp.C((Object)obj.Z1, (alp)hfv.M1);
        flp.C((Object)obj.a2, (alp)zwj.L0);
        flp.t(obj.c2);
        flp.t(obj.d2);
        flp.t(obj.e2);
        flp.t(obj.f2);
        flp.t(obj.g2);
        flp.A(obj.h2);
    }
}
