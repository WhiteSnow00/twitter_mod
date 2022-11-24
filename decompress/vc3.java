import tv.periscope.android.view.RootDragLayout;
import android.view.View;
import tv.periscope.android.video.BufferProperties;
import android.util.Pair;
import java.util.concurrent.TimeUnit;
import tv.periscope.android.ui.broadcast.ChatRoomView$e;
import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.io.File;
import android.media.MediaFormat;
import android.graphics.Bitmap;
import tv.periscope.android.video.VideoRecorder;
import tv.periscope.android.graphics.GLRenderView;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vc3 implements mc3, wb3$a, eo2$a, hi2
{
    public boolean A1;
    public boolean B1;
    public boolean C1;
    public final Activity F0;
    public final k9x G0;
    public final yd3 H0;
    public final GLRenderView I0;
    public final wb3 J0;
    public final eo2 K0;
    public final jc3 L0;
    public final sb3 M0;
    public final me3 N0;
    public final be3 O0;
    public final VideoRecorder P0;
    public final d1h Q0;
    public final qdw R0;
    public final j4k S0;
    public final n4k T0;
    public final gra<hi2, i5k> U0;
    public final yc3 V0;
    public final llo W0;
    public final mf1 X0;
    public final nn Y0;
    public final dci Z0;
    public final boolean a1;
    public final vb3 b1;
    public final bd3 c1;
    public final aih d1;
    public final bxo e1;
    public final bxo f1;
    public final uv1<Boolean> g1;
    public final znl<dwg> h1;
    public final znl<Bitmap> i1;
    public final znl<Bitmap> j1;
    public final znl<Bitmap> k1;
    public final znl<kni> l1;
    public final znl<kni> m1;
    public final znl<noj<th2>> n1;
    public final znl<kni> o1;
    public final de6 p1;
    public i5k q1;
    public final e39 r1;
    public final e39 s1;
    public final e39 t1;
    public final e39 u1;
    public final uv1<Boolean> v1;
    public final uv1<Boolean> w1;
    public MediaFormat x1;
    public MediaFormat y1;
    public File z1;
    
    public vc3(final Activity f0, final k9x g0, final yd3 h0, final GLRenderView i0, final wb3 j0, final eo2 k0, final jc3 l0, final sb3 m0, final me3 n0, final be3 o0, final VideoRecorder p28, final d1h q0, final qdw r0, final j4k s0, final n4k t0, final gra<hi2, i5k> u0, final yc3 v0, final mf1 x0, final nn y0, final llo w0, final dci z0, final boolean a1, final vb3 b1, final bd3 c1, final aih d1, final bxo e1, final bxo f2, final uv1<Boolean> v2) {
        this.r1 = new e39();
        this.s1 = new e39();
        this.t1 = new e39();
        this.u1 = new e39();
        this.w1 = (uv1<Boolean>)new uv1();
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p28;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        this.V0 = v0;
        this.W0 = w0;
        this.X0 = x0;
        this.Y0 = y0;
        this.Z0 = z0;
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.d1 = d1;
        this.e1 = e1;
        this.f1 = f2;
        this.g1 = (uv1<Boolean>)uv1.e((Object)Boolean.FALSE);
        this.h1 = (znl<dwg>)new znl();
        this.i1 = (znl<Bitmap>)new znl();
        this.j1 = (znl<Bitmap>)new znl();
        this.k1 = (znl<Bitmap>)new znl();
        this.l1 = (znl<kni>)new znl();
        this.m1 = (znl<kni>)new znl();
        this.n1 = (znl<noj<th2>>)new znl();
        this.o1 = (znl<kni>)new znl();
        this.p1 = new de6();
        this.v1 = v2;
        ((View)i0).setVisibility(8);
    }
    
    public static Bitmap B(final Bitmap bitmap, final int n, final boolean b) {
        if (n == 0 && !b) {
            return bitmap;
        }
        final Bitmap bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), c8d.b(n, b).f(), true);
        bitmap.recycle();
        return bitmap2;
    }
    
    public final boolean A() {
        return this.z1 != null;
    }
    
    public final t5j<Bitmap> B1() {
        return (t5j<Bitmap>)this.j1;
    }
    
    public final void C(final Bitmap bitmap) {
        this.i1.onNext((Object)bitmap);
        final de6 p = this.p1;
        final bbq y = this.Q0.b(new twg(e2h.J0)).a((stb)new sc3(bitmap)).I(this.e1).y(this.f1);
        final znl<dwg> h1 = this.h1;
        Objects.requireNonNull(h1);
        p.a(y.G((rk6)new rc3((znl)h1, 1), (rk6)lvb.e));
    }
    
    public final boolean D() {
        lp7.t((Class)vc3.class, "stopRecordingVideoInternal");
        this.y();
        if (this.A()) {
            this.P0.stopRecording();
            return true;
        }
        return false;
    }
    
    public final void E(final int n) {
        final w4a a = this.N0.a();
        final boolean m = this.J0.U().m;
        if (!this.B1 && !this.A() && (!this.J0.a().equals(a) || !m)) {
            this.g1.onNext((Object)Boolean.FALSE);
            this.x1 = null;
            this.y1 = null;
            this.J0.G(n);
            this.J0.C(a);
            return;
        }
        this.g1.onNext((Object)Boolean.TRUE);
    }
    
    public final t5j<noj<th2>> I() {
        return (t5j<noj<th2>>)this.n1;
    }
    
    public final yz5 K0() {
        this.m1.onNext((Object)kni.a);
        lp7.t((Class)vc3.class, "startRecordingVideo");
        final boolean m = this.J0.U().m;
        final boolean b = false;
        if (m && this.x1 != null && this.y1 != null) {
            fj1.b(this.A() ^ true);
            final mes c = mes.c();
            final e2h l0 = e2h.L0;
            this.z1 = c.d("mp4");
            final de6 p1 = this.p1;
            final bbq j = this.J0.J();
            final znl<Bitmap> k1 = this.k1;
            Objects.requireNonNull(k1);
            p1.a(j.G((rk6)new rc3((znl)k1, 0), (rk6)lvb.e));
            this.P0.startRecording(this.z1.getAbsolutePath(), this.x1, this.y1);
            if (this.c1.d() == 1) {
                this.v();
            }
            return this.P0.observeMinimumDurationReached().take(1L).ignoreElements();
        }
        final StringBuilder f = ehk.f("startRecordingVideo: ");
        f.append(this.x1 == null);
        f.append(", ");
        boolean b2 = b;
        if (this.y1 == null) {
            b2 = true;
        }
        f.append(b2);
        f.append(", encoding: ");
        f.append(this.J0.U().m);
        lp7.t((Class)vc3.class, f.toString());
        return (yz5)new j06((Throwable)new IllegalStateException("Started recording while not encoding"));
    }
    
    public final void O3(final float n) {
        final wb3 j0 = this.J0;
        j0.d((int)(j0.c() * n));
    }
    
    public final void Q() {
        if (this.u1.b()) {
            return;
        }
        this.I0.c();
        this.u1.c(((t5j)this.w1).filter((ouk)j71.R0).firstElement().o((rk6)new qc3(this, 1), (rk6)lvb.e, (sj)lvb.c));
    }
    
    public final boolean Q0() {
        if (this.A1) {
            final i5k q1 = this.q1;
            vmw.g((Object)q1);
            final i5k i5k = q1;
            if (q1.B()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean R2() {
        return (boolean)this.g1.f();
    }
    
    public final t5j<dwg> T3() {
        return (t5j<dwg>)this.h1;
    }
    
    public final void V3() {
        lp7.t((Class)vc3.class, "stopRecordingVideo");
        if (this.D()) {
            this.l1.onNext((Object)kni.a);
            final de6 p1 = this.p1;
            final g1h b = this.Q0.b(new twg(e2h.L0));
            final File z1 = this.z1;
            vmw.g((Object)z1);
            final bbq y = b.b(z1, true).I(this.e1).y(this.f1);
            final znl<dwg> h1 = this.h1;
            Objects.requireNonNull(h1);
            p1.a(y.G((rk6)new kd1((Object)h1, 16), (rk6)lvb.e));
            this.z1 = null;
        }
    }
    
    public final void Y3() {
        lp7.t((Class)vc3.class, "cancelRecordingVideo");
        if (this.D()) {
            mes.c().b(this.z1);
            this.z1 = null;
            this.E(this.N0.b());
            this.Z0.a();
        }
    }
    
    public final void Z3() {
        if (this.q1 == null) {
            this.q1 = (i5k)this.U0.a((Object)this);
        }
        this.r1.c(this.T0.a(this.R0, this.S0, k4k.G0).observeOn(this.f1).filter((ouk)j71.Q0).subscribe((rk6)new qc3(this, 0)));
    }
    
    public final void b(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        this.P0.onAudio(byteBuffer, mediaCodec$BufferInfo);
    }
    
    public final void bind() {
        if (this.C1) {
            return;
        }
        this.C1 = true;
        this.p1.e();
        final de6 p1 = this.p1;
        final znl c = this.O0.c;
        final wb3 j0 = this.J0;
        Objects.requireNonNull(j0);
        p1.d(new b39[] { ((t5j)c).subscribe((rk6)new kd1((Object)j0, 15)), ((t5j)this.O0.e).distinctUntilChanged().subscribe((rk6)new ppa(this, 12)), this.c1.a().subscribe((rk6)new vhd((Object)this, 16)), t5j.combineLatest((fbj)this.c1.f(), (fbj)this.d1.o4(), (hw1)nc3.G0).subscribe((rk6)new ces((Object)this, 24)) });
        this.p1.a(this.H0.a().subscribe((rk6)new bes((Object)this, 23)));
        this.X0.a((mf1$a)this);
        this.W0.c();
    }
    
    public final void c() {
        this.A1 = true;
        this.W0.b();
        this.Z0.c();
        this.b1.a("live_button");
    }
    
    public final t5j<kni> e3() {
        return (t5j<kni>)this.o1;
    }
    
    public final void g(final String s, final String s2) {
        this.A1 = false;
        this.B1 = false;
        this.W0.c();
        final i5k q1 = this.q1;
        vmw.g((Object)q1);
        final i5k i5k = q1;
        final Activity f0 = this.F0;
        q1.X();
        q1.N0.setBottomTrayState(ChatRoomView$e.F0);
        ((View)q1.N0).setVisibility(4);
        ((RootDragLayout)q1.K0).setDraggable(false);
        ((RootDragLayout)q1.K0).setBottomChildrenDraggable(false);
        q1.F();
        q1.E();
        q1.D(true, f0.getApplication());
        this.q1 = null;
        final qof b = this.L0.b;
        if (b instanceof qof$d && !((qof$d)b).a) {
            final znl<noj<th2>> n1 = this.n1;
            final noj b2 = noj.b;
            final int a = o5j.a;
            n1.onNext((Object)b2);
        }
        else {
            this.n1.onNext((Object)new noj((Object)new th2(s, "LexDirectFull", s2, true)));
        }
        this.O0.a();
        this.b1.a("stop_button");
    }
    
    public final void h1() {
        if (!(boolean)this.g1.f()) {
            return;
        }
        this.g1.onNext((Object)Boolean.FALSE);
        Objects.requireNonNull(this.V0);
        if (ita.b().b("newscamera_android_high_quality_photo_capture_enabled", false)) {
            if (this.c1.d() == 1) {
                this.J0.y("on");
            }
            final Pair i = this.J0.I(this.M0.e);
            this.p1.a(((yz5)i.first).q((sj)new kgc(this, 8)));
            this.p1.a(((bbq)i.second).G((rk6)new lem((Object)this, 22), (rk6)zxw.K0));
        }
        else if (this.c1.d() == 1) {
            this.v();
            final ee3 u = this.J0.U();
            Objects.requireNonNull(u);
            this.p1.a(yz5.u(TimeUnit.NANOSECONDS.toMillis(u.k) * 10L, TimeUnit.MILLISECONDS).n(this.f1).q((sj)new qp3((Object)this, 12)));
        }
        else {
            this.x();
        }
    }
    
    public final void j() {
        if (this.q1 != null) {
            final e39 r1 = this.r1;
            final yz5 ignoreElements = this.T0.a(this.R0, this.S0, k4k.G0).observeOn(this.f1).ignoreElements();
            final i5k q1 = this.q1;
            Objects.requireNonNull(q1);
            r1.c(ignoreElements.q((sj)new eck((Object)q1, 11)));
        }
    }
    
    public final t5j<Boolean> j3() {
        return (t5j<Boolean>)((t5j)this.g1).observeOn(this.f1);
    }
    
    public final void k(final ff3 ff3, final String s) {
        r9a.d((Throwable)new IllegalStateException(mqb.l("Fatal camera error: ", s)));
        this.o1.onNext((Object)kni.a);
    }
    
    public final void n() {
        this.A1 = false;
        this.B1 = false;
        this.W0.c();
        this.Z0.l(false);
        this.O0.a();
    }
    
    public final t5j<Bitmap> o0() {
        return (t5j<Bitmap>)this.i1;
    }
    
    public final void p3() {
        final i5k q1 = this.q1;
        if (q1 != null && this.B1) {
            q1.B();
        }
        if (this.J0.z()) {
            this.E(this.N0.b());
        }
    }
    
    public final void q() {
        this.b1.a("back_button");
    }
    
    public final t5j<Bitmap> q4() {
        return (t5j<Bitmap>)this.k1;
    }
    
    public final void r(final MediaFormat x1, final MediaFormat y1) {
        this.x1 = x1;
        this.y1 = y1;
        this.g1.onNext((Object)Boolean.TRUE);
    }
    
    public final void u(final ByteBuffer byteBuffer, final BufferProperties bufferProperties) {
        this.P0.onVideo(byteBuffer, bufferProperties);
    }
    
    public final void unbind() {
        this.w1.onNext((Object)Boolean.FALSE);
        this.C1 = false;
        this.P0.stopRecording();
        this.w();
        this.J0.w();
        this.p1.dispose();
        this.X0.b((mf1$a)this);
        this.r1.a();
        this.t1.a();
        this.u1.a();
    }
    
    public final void v() {
        this.J0.y("torch");
    }
    
    public final void w() {
        if (!this.u1.b()) {
            return;
        }
        this.I0.b();
        this.J0.V();
        this.s1.a();
        if (!this.B1) {
            this.J0.K();
        }
        this.u1.a();
    }
    
    public final void x() {
        this.l1.onNext((Object)kni.a);
        this.p1.a(this.J0.S(this.M0.e).G((rk6)new oc3(this, 1), (rk6)lvb.e));
    }
    
    public final void y() {
        this.J0.y("off");
    }
    
    public final void z() {
        this.C1 = false;
        this.X0.b((mf1$a)this);
        this.Y0.cancel();
    }
    
    public final t5j<kni> z2() {
        return (t5j<kni>)this.l1;
    }
}
