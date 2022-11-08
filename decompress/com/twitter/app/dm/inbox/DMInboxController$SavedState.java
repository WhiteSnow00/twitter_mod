// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.inbox;

import java.io.IOException;
import java.util.Objects;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@lpe
public class DMInboxController$SavedState<OBJ extends DMInboxController> extends dq1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<DMInboxController$SavedState>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new DMInboxController$SavedState(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new DMInboxController$SavedState[n];
            }
        };
    }
    
    public DMInboxController$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public DMInboxController$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final elp elp, final OBJ obj) throws IOException, ClassNotFoundException {
        final DMInboxController dmInboxController = (DMInboxController)super.deserializeValue(elp, (Object)obj);
        final alp k = bp7.k();
        Objects.requireNonNull(elp);
        dmInboxController.i = (gid)k.a(elp);
        dmInboxController.j = elp.u();
        dmInboxController.k = elp.u();
        return (OBJ)dmInboxController;
    }
    
    public void serializeValue(final flp flp, final OBJ obj) throws IOException {
        super.serializeValue(flp, (Object)obj);
        flp.C((Object)obj.i, bp7.k());
        flp.t(obj.j);
        flp.t(obj.k);
    }
}
