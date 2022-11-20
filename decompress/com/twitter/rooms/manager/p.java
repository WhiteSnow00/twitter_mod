// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import java.util.Iterator;
import tv.periscope.android.api.PeriscopeUnauthorizedResponse$Error;
import retrofit2.Response;
import java.util.Collection;
import java.util.Objects;
import com.twitter.periscope.auth.PeriscopeUnauthorizedException;
import retrofit2.HttpException;

@sa8(c = "com.twitter.rooms.manager.RoomStateManager$getAudioSpace$1$3$2", f = "RoomStateManager.kt", l = {}, m = "invokeSuspend")
public final class p extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomStateManager E0;
    public final vqn F0;
    
    public p(final RoomStateManager e0, final vqn f0, final go6<? super p> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final p p2 = new p(this.E0, this.F0, (go6<? super p>)go6);
        p2.D0 = d0;
        return (go6<fzv>)p2;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final p p2 = (p)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        p2.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final Throwable t = (Throwable)this.D0;
        final boolean b = t instanceof HttpException;
        final boolean b2 = false;
        Label_0360: {
            if (b) {
                final Response response = ((HttpException)t).response();
                if (response != null && response.code() == 403) {
                    this.E0.X0.a();
                    break Label_0360;
                }
            }
            if (b) {
                final Response response2 = ((HttpException)t).response();
                if (response2 != null && response2.code() == 404) {
                    RoomStateManager.r0(this.E0, false, true, false, false, (nsb)null, 29);
                    break Label_0360;
                }
            }
            if (b) {
                final HttpException ex = (HttpException)t;
                final Response response3 = ex.response();
                if (response3 != null && response3.code() == 401) {
                    final PeriscopeUnauthorizedException a = PeriscopeUnauthorizedException.a(ex);
                    if (a == null) {
                        break Label_0360;
                    }
                    final RoomStateManager e0 = this.E0;
                    final PeriscopeUnauthorizedResponse$Error d0 = a.D0;
                    if (d0 == null) {
                        break Label_0360;
                    }
                    final zio a2 = e0.a1;
                    final String rectifyUrl = d0.rectifyUrl;
                    czd.e((Object)rectifyUrl, "reason.rectifyUrl");
                    Objects.requireNonNull(a2);
                    ((wgm)a2).a((Object)new dj6(rectifyUrl));
                    break Label_0360;
                }
            }
            if (t instanceof d11$b) {
                final kbv d2 = ((d11$b)t).D0;
                int n = 0;
                Label_0346: {
                    if (d2 instanceof Collection && ((Collection)d2).isEmpty()) {
                        n = (b2 ? 1 : 0);
                    }
                    else {
                        final Iterator<hbv> iterator = d2.iterator();
                        do {
                            n = (b2 ? 1 : 0);
                            if (iterator.hasNext()) {
                                continue;
                            }
                            break Label_0346;
                        } while (iterator.next().a != 37);
                        n = 1;
                    }
                }
                if (n != 0) {
                    this.E0.X0.a();
                }
            }
        }
        final vqn f0 = this.F0;
        if (f0.b != null && blz.M(f0)) {
            this.E0.m1.a.onNext((Object)new o1o$a$b(this.F0.b));
        }
        final RoomStateManager e2 = this.E0;
        if (e2.B1 == 0L) {
            e2.B1 = wa2.n();
        }
        RoomStateManager.i0(this.E0);
        final RoomStateManager e3 = this.E0;
        final StringBuilder sb = new StringBuilder();
        sb.append("getAudioSpace failed ");
        sb.append(t);
        RoomStateManager.Z(e3, sb.toString());
        return fzv.a;
    }
}
