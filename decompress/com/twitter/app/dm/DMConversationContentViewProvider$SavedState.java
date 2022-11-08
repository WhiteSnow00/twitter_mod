// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm;

import java.io.IOException;
import java.util.Set;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@lpe
public class DMConversationContentViewProvider$SavedState<OBJ extends DMConversationContentViewProvider> extends dq1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new DMConversationContentViewProvider$SavedState$a();
    }
    
    public DMConversationContentViewProvider$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public DMConversationContentViewProvider$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final elp elp, final OBJ obj) throws IOException, ClassNotFoundException {
        final DMConversationContentViewProvider dmConversationContentViewProvider = (DMConversationContentViewProvider)super.deserializeValue(elp, (Object)obj);
        dmConversationContentViewProvider.h1 = elp.u();
        dmConversationContentViewProvider.b1 = (jp7)((s4j)jp7.w).a(elp);
        dmConversationContentViewProvider.c1 = (Set)fk7.G().a(elp);
        dmConversationContentViewProvider.d1 = elp.I();
        dmConversationContentViewProvider.e1 = elp.I();
        dmConversationContentViewProvider.f1 = elp.I();
        dmConversationContentViewProvider.g1 = (lmv$a)((s4j)lmv$a.e).a(elp);
        dmConversationContentViewProvider.i1 = elp.u();
        dmConversationContentViewProvider.j1 = elp.u();
        dmConversationContentViewProvider.k1 = elp.u();
        dmConversationContentViewProvider.l1 = elp.u();
        dmConversationContentViewProvider.m1 = elp.u();
        dmConversationContentViewProvider.n1 = elp.u();
        dmConversationContentViewProvider.o1 = elp.u();
        dmConversationContentViewProvider.p1 = elp.u();
        dmConversationContentViewProvider.q1 = elp.u();
        dmConversationContentViewProvider.r1 = elp.u();
        dmConversationContentViewProvider.s1 = elp.u();
        dmConversationContentViewProvider.t1 = elp.u();
        dmConversationContentViewProvider.u1 = elp.u();
        dmConversationContentViewProvider.v1 = elp.u();
        dmConversationContentViewProvider.w1 = elp.A();
        return (OBJ)dmConversationContentViewProvider;
    }
    
    public void serializeValue(final flp flp, final OBJ obj) throws IOException {
        super.serializeValue(flp, (Object)obj);
        flp.t(obj.h1);
        flp.C((Object)obj.b1, (alp)jp7.w);
        flp.C((Object)obj.c1, fk7.G());
        flp.G(obj.d1);
        flp.G(obj.e1);
        flp.G(obj.f1);
        ((s4j)lmv$a.e).c(flp, (Object)obj.g1);
        final int a = w4j.a;
        flp.t(obj.i1);
        flp.t(obj.j1);
        flp.t(obj.k1);
        flp.t(obj.l1);
        flp.t(obj.m1);
        flp.t(obj.n1);
        flp.t(obj.o1);
        flp.t(obj.p1);
        flp.t(obj.q1);
        flp.t(obj.r1);
        flp.t(obj.s1);
        flp.t(obj.t1);
        flp.t(obj.u1);
        flp.t(obj.v1);
        flp.A(obj.w1);
    }
}
