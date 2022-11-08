// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.common.timeline.cover;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@lpe
public class URTCoverController$SavedState<OBJ extends URTCoverController> extends dq1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new URTCoverController$SavedState$a();
    }
    
    public URTCoverController$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public URTCoverController$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final elp elp, final OBJ obj) throws IOException, ClassNotFoundException {
        final URTCoverController urtCoverController = (URTCoverController)super.deserializeValue(elp, (Object)obj);
        elp.u();
        urtCoverController.a = (hov)((s4j)hov.k).a(elp);
        urtCoverController.b = (oov)((s4j)oov.j).a(elp);
        urtCoverController.c = (qzo)((s4j)qzo.x).a(elp);
        return (OBJ)urtCoverController;
    }
    
    public void serializeValue(final flp flp, final OBJ obj) throws IOException {
        super.serializeValue(flp, (Object)obj);
        flp.t(true);
        flp.C((Object)obj.a, (alp)hov.k);
        flp.C((Object)obj.b, (alp)oov.j);
        flp.C((Object)obj.c, (alp)qzo.x);
    }
}
