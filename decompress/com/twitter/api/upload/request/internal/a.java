// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.upload.request.internal;

import java.io.IOException;
import com.twitter.model.json.media.JsonMediaResponse;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

public final class a extends BaseUploadRequest<ezg>
{
    public final asc<ezg, kbv> n1;
    public final Context o1;
    public long p1;
    public final String q1;
    
    public a(final Context o1, final UserIdentifier userIdentifier, final jvg jvg, final List<d2h> list) {
        super(userIdentifier, jvg.g(), jvg.c, (List)list);
        this.n1 = new v8g$d((Class)JsonMediaResponse.class, (Class)kbv.class);
        this.p1 = -1L;
        this.o1 = o1;
        this.q1 = jvg.e;
        final mpm<Object, Object> y = ((anm<Object, Object>)this).Y();
        final xf4 x0 = xf4.X0;
        final a2p$a a2p$a = (a2p$a)y;
        a2p$a.c(x0);
        final uf4 g0 = a2p$a.a.G0;
        jee.l((Object)g0);
        rpb.W(g0, jvg);
    }
    
    public final void C(final xrc<ezg, kbv> xrc) {
        if (xrc.b) {
            final ezg ezg = (ezg)((asc)this.n1).D0;
            if (ezg != null) {
                this.p1 = ezg.a;
            }
        }
    }
    
    public final asc<ezg, kbv> g0() {
        return (asc<ezg, kbv>)this.n1;
    }
    
    public final void o0(final tqc$a tqc$a) throws BaseUploadRequest$BuilderInitException {
        final hth d = new hth();
        try {
            final uwm uwm = new uwm(this.o1, super.j1);
            d.f("media", ikr.p(8), (twm)uwm, uwm.b(), lm6.H0);
            d.g();
            tqc$a.d = d;
            final int a = c5j.a;
            y1h.a(tqc$a, this.q1);
        }
        catch (final IOException ex) {
            throw new BaseUploadRequest$BuilderInitException((Exception)ex);
        }
    }
}
