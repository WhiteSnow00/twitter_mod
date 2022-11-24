// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.users;

import java.io.IOException;
import java.util.Map;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@upe
public class UsersContentViewProvider$SavedState<OBJ extends UsersContentViewProvider> extends eq1<OBJ>
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
    
    public OBJ deserializeValue(final rmp rmp, final OBJ obj) throws IOException, ClassNotFoundException {
        final UsersContentViewProvider usersContentViewProvider = (UsersContentViewProvider)super.deserializeValue(rmp, (Object)obj);
        usersContentViewProvider.e1 = rmp.u();
        usersContentViewProvider.f1 = rmp.u();
        usersContentViewProvider.g1 = (long[])((k5j)rx6.l).a(rmp);
        usersContentViewProvider.h1 = (qgv)((k5j)qgv.P1).a(rmp);
        usersContentViewProvider.k1 = (dsb)((k5j)dsb.G0).a(rmp);
        usersContentViewProvider.l1 = (Map)vmw.o().a(rmp);
        usersContentViewProvider.m1 = (j84)((k5j)j84.c).a(rmp);
        usersContentViewProvider.o1 = rmp.z();
        return (OBJ)usersContentViewProvider;
    }
    
    public /* bridge */ Object deserializeValue(final rmp rmp, final Object o) throws IOException, ClassNotFoundException {
        return this.deserializeValue(rmp, (UsersContentViewProvider)o);
    }
    
    public void serializeValue(final smp smp, final OBJ obj) throws IOException {
        super.serializeValue(smp, (Object)obj);
        smp.t(obj.e1);
        smp.t(obj.f1);
        smp.C((Object)obj.g1, (nmp)rx6.l);
        smp.C((Object)obj.h1, (nmp)qgv.P1);
        ((k5j)dsb.G0).c(smp, (Object)obj.k1);
        final int a = o5j.a;
        smp.C((Object)obj.l1, vmw.o());
        ((k5j)j84.c).c(smp, (Object)obj.m1);
        smp.z(obj.o1);
    }
    
    public /* bridge */ void serializeValue(final smp smp, final Object o) throws IOException {
        this.serializeValue(smp, (UsersContentViewProvider)o);
    }
}
