// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.upload.request.internal;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

public final class b extends y4r
{
    public volatile boolean q1;
    public final int r1;
    public final kxa s1;
    public final long t1;
    public final w19 u1;
    public final l94 v1;
    
    public b(final Context context, final UserIdentifier userIdentifier, final jvg jvg, final long t1, final l94 v1, final int r1, final List<d2h> list, final boolean b) {
        super(context, userIdentifier, jvg, list, b);
        this.u1 = new w19();
        this.r1 = r1;
        this.s1 = v1.D0;
        this.t1 = t1;
        this.v1 = v1;
        ((wv0<Object>)this).I();
    }
    
    public final /* bridge */ Object b() throws InterruptedException {
        return this.b();
    }
    
    public final xrc<z4r, kbv> b() {
        synchronized (this) {
            this.u1.c(rw0.g(TimeUnit.MILLISECONDS, 120000L, (oj)new qt1((Object)this, 4)));
            return (xrc<z4r, kbv>)super.b();
        }
    }
    
    @Override
    public final void e(final atm<xrc<z4r, kbv>> atm) {
        if (this.q1) {
            atm.a((xrc<z4r, kbv>)xrc.b(1009, (Exception)new IOException()));
        }
        this.u1.a();
        h1e.a((Closeable)this.s1);
        super.e(atm);
    }
    
    @Override
    public final asc<z4r, kbv> g0() {
        return (asc<z4r, kbv>)new zrc();
    }
    
    public final void j(final atm<xrc<z4r, kbv>> atm) {
        ((anm)this).V0 = false;
        try {
            this.s1.G();
        }
        catch (final Exception ex) {
            atm.a((xrc<z4r, kbv>)xrc.b(1008, ex));
            ((wv0)this).H(true);
        }
    }
    
    public final void o0(final tqc$a tqc$a) throws BaseUploadRequest$BuilderInitException {
        final hth d = new hth();
        try {
            d.f("media", ikr.p(8), (twm)this.s1, (int)this.v1.F0, null);
            d.g();
            tqc$a.d = d;
            final int a = c5j.a;
            if (super.n1) {
                tqc$a.d("command", "APPEND");
                tqc$a.c("media_id", this.t1);
                tqc$a.c("segment_index", (long)this.r1);
                tqc$a.d("segment_md5", this.v1.G0);
            }
            else {
                tqc$a.l("X-SessionPhase", "APPEND");
                tqc$a.l("X-MediaId", Long.toString(this.t1));
                tqc$a.l("Content-MD5", this.v1.G0);
                tqc$a.l("X-SegmentIndex", Integer.toString(this.r1));
                tqc$a.l("X-TotalBytes", Long.toString(this.v1.F0));
            }
        }
        catch (final IOException ex) {
            throw new BaseUploadRequest$BuilderInitException((Exception)ex);
        }
    }
}
