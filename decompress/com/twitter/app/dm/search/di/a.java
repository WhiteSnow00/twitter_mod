// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.search.di;

public final class a
{
    public a(final ww7<ls7, xr7, fs7> ww7, final ibm ibm) {
        if (ww7 instanceof yr7) {
            final yr7 yr7 = (yr7)ww7;
            ibm.i((rj)new mcs((Object)yr7.a.b().observeOn(yr7.b).subscribe((fk6)new zak((rtb)new as7((Object)yr7), 10)), (Object)((b5j)yr7.f).distinctUntilChanged().flatMapCompletable((qtb)new nla((rtb)new bs7(yr7), 3)).p(), (Object)((b5j)yr7.d).subscribe((fk6)new xt1((rtb)new zr7((Object)yr7), 3)), (Object)yr7, 1));
        }
    }
}
