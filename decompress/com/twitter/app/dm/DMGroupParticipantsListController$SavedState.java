// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@lpe
public class DMGroupParticipantsListController$SavedState<OBJ extends DMGroupParticipantsListController> extends dq1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new DMGroupParticipantsListController$SavedState$a();
    }
    
    public DMGroupParticipantsListController$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public DMGroupParticipantsListController$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final elp elp, final OBJ obj) throws IOException, ClassNotFoundException {
        final DMGroupParticipantsListController dmGroupParticipantsListController = (DMGroupParticipantsListController)super.deserializeValue(elp, (Object)obj);
        elp.u();
        dmGroupParticipantsListController.a = (dsb)((s4j)dsb.D0).a(elp);
        dmGroupParticipantsListController.b = (long[])((s4j)hx6.l).a(elp);
        return (OBJ)dmGroupParticipantsListController;
    }
    
    public void serializeValue(final flp flp, final OBJ obj) throws IOException {
        super.serializeValue(flp, (Object)obj);
        flp.t(true);
        ((s4j)dsb.D0).c(flp, (Object)obj.a);
        final int a = w4j.a;
        flp.C((Object)obj.b, (alp)hx6.l);
    }
}
