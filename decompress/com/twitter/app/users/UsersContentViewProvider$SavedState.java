// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.users;

import java.io.IOException;
import java.util.Map;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@xoe
public class UsersContentViewProvider$SavedState<OBJ extends UsersContentViewProvider> extends zp1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new UsersContentViewProvider$SavedState$a();
    }
    
    public UsersContentViewProvider$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public UsersContentViewProvider$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final vlp vlp, final OBJ obj) throws IOException, ClassNotFoundException {
        final UsersContentViewProvider usersContentViewProvider = (UsersContentViewProvider)super.deserializeValue(vlp, (Object)obj);
        usersContentViewProvider.c1 = vlp.s();
        usersContentViewProvider.d1 = vlp.s();
        usersContentViewProvider.e1 = (long[])((y4j)lw6.l).a(vlp);
        usersContentViewProvider.f1 = (cgv)((y4j)cgv.N1).a(vlp);
        usersContentViewProvider.i1 = (brb)((y4j)brb.E0).a(vlp);
        usersContentViewProvider.j1 = (Map)gmw.s().a(vlp);
        usersContentViewProvider.k1 = (f74)((y4j)f74.c).a(vlp);
        usersContentViewProvider.m1 = vlp.x();
        return (OBJ)usersContentViewProvider;
    }
    
    public /* bridge */ Object deserializeValue(final vlp vlp, final Object o) throws IOException, ClassNotFoundException {
        return this.deserializeValue(vlp, (UsersContentViewProvider)o);
    }
    
    public void serializeValue(final wlp wlp, final OBJ obj) throws IOException {
        super.serializeValue(wlp, (Object)obj);
        wlp.r(obj.c1);
        wlp.r(obj.d1);
        wlp.A((Object)obj.e1, (rlp)lw6.l);
        wlp.A((Object)obj.f1, (rlp)cgv.N1);
        ((y4j)brb.E0).c(wlp, (Object)obj.i1);
        final int a = c5j.a;
        wlp.A((Object)obj.j1, gmw.s());
        ((y4j)f74.c).c(wlp, (Object)obj.k1);
        wlp.x(obj.m1);
    }
    
    public /* bridge */ void serializeValue(final wlp wlp, final Object o) throws IOException {
        this.serializeValue(wlp, (UsersContentViewProvider)o);
    }
}
