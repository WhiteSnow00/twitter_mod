// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.common.timeline.cover;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@xoe
public class URTCoverController$SavedState<OBJ extends URTCoverController> extends zp1<OBJ>
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
    
    public OBJ deserializeValue(final vlp vlp, final OBJ obj) throws IOException, ClassNotFoundException {
        final URTCoverController urtCoverController = (URTCoverController)super.deserializeValue(vlp, (Object)obj);
        vlp.s();
        urtCoverController.a = (gpv)((y4j)gpv.k).a(vlp);
        urtCoverController.b = (npv)((y4j)npv.j).a(vlp);
        urtCoverController.c = (h0p)((y4j)h0p.x).a(vlp);
        return (OBJ)urtCoverController;
    }
    
    public /* bridge */ Object deserializeValue(final vlp vlp, final Object o) throws IOException, ClassNotFoundException {
        return this.deserializeValue(vlp, (URTCoverController)o);
    }
    
    public void serializeValue(final wlp wlp, final OBJ obj) throws IOException {
        super.serializeValue(wlp, (Object)obj);
        wlp.r(true);
        wlp.A((Object)obj.a, (rlp)gpv.k);
        wlp.A((Object)obj.b, (rlp)npv.j);
        wlp.A((Object)obj.c, (rlp)h0p.x);
    }
    
    public /* bridge */ void serializeValue(final wlp wlp, final Object o) throws IOException {
        this.serializeValue(wlp, (URTCoverController)o);
    }
}
