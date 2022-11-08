// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.account.smartlock;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@lpe
public class ActivityBasedLoginAssistResultResolver$SavedState<OBJ extends ActivityBasedLoginAssistResultResolver> extends dq1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new ActivityBasedLoginAssistResultResolver$SavedState$a();
    }
    
    public ActivityBasedLoginAssistResultResolver$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public ActivityBasedLoginAssistResultResolver$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final elp elp, final OBJ obj) throws IOException, ClassNotFoundException {
        final ActivityBasedLoginAssistResultResolver activityBasedLoginAssistResultResolver = (ActivityBasedLoginAssistResultResolver)super.deserializeValue(elp, (Object)obj);
        activityBasedLoginAssistResultResolver.a = elp.u();
        return (OBJ)activityBasedLoginAssistResultResolver;
    }
    
    public void serializeValue(final flp flp, final OBJ obj) throws IOException {
        super.serializeValue(flp, (Object)obj);
        flp.t(obj.a);
    }
}
