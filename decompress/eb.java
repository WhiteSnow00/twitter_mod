import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import kotlinx.serialization.encoding.Encoder$a;
import android.view.View;
import java.util.Set;
import java.util.Objects;
import java.nio.ByteBuffer;
import java.util.Collection;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class eb implements e26, Encoder, ee6, x1, v9h
{
    public static lie.lie$a F0;
    
    public void B(final SerialDescriptor serialDescriptor, final int n, final char c) {
        e0e.f((Object)serialDescriptor, "descriptor");
        this.n0(serialDescriptor, n);
        this.M(c);
    }
    
    public void C(final w1 w1, final i6 i6) {
        e0e.f((Object)i6, "snapshot");
        this.p0(w1);
    }
    
    public void D() {
        throw new SerializationException("'null' is not supported by default");
    }
    
    public void E(final SerialDescriptor serialDescriptor, final int n, final byte b) {
        e0e.f((Object)serialDescriptor, "descriptor");
        this.n0(serialDescriptor, n);
        this.j(b);
    }
    
    public abstract void F(final short p0);
    
    public void G(final boolean b) {
        this.o0(b);
        throw null;
    }
    
    public void H(final SerialDescriptor serialDescriptor, final int n, final float n2) {
        e0e.f((Object)serialDescriptor, "descriptor");
        this.n0(serialDescriptor, n);
        this.J(n2);
    }
    
    public void J(final float n) {
        this.o0(n);
        throw null;
    }
    
    public void K(final fmp fmp, final Object o) {
        e0e.f((Object)fmp, "serializer");
        fmp.serialize((Encoder)this, o);
    }
    
    public void M(final char c) {
        this.o0(c);
        throw null;
    }
    
    public void P() {
    }
    
    public void Q(final SerialDescriptor serialDescriptor, final int n, final int n2) {
        e0e.f((Object)serialDescriptor, "descriptor");
        this.n0(serialDescriptor, n);
        this.b0(n2);
    }
    
    public void R(final SerialDescriptor serialDescriptor, final int n, final boolean b) {
        e0e.f((Object)serialDescriptor, "descriptor");
        this.n0(serialDescriptor, n);
        this.G(b);
    }
    
    public void S(final SerialDescriptor serialDescriptor, final int n, final String s) {
        e0e.f((Object)serialDescriptor, "descriptor");
        e0e.f((Object)s, "value");
        this.n0(serialDescriptor, n);
        this.l0(s);
    }
    
    public void T(final SerialDescriptor serialDescriptor, final int n, final fmp fmp, final Object o) {
        e0e.f((Object)serialDescriptor, "descriptor");
        e0e.f((Object)fmp, "serializer");
        this.n0(serialDescriptor, n);
        this.K(fmp, o);
    }
    
    public x1 W(final d2 d2) {
        e0e.f((Object)d2, "object");
        return (x1)this;
    }
    
    public x1 Y(final Collection collection) {
        e0e.f((Object)collection, "objects");
        return (x1)this;
    }
    
    public abstract void b0(final int p0);
    
    public ee6 c(final SerialDescriptor serialDescriptor) {
        e0e.f((Object)serialDescriptor, "descriptor");
        return (ee6)this;
    }
    
    public void d(final SerialDescriptor serialDescriptor) {
        e0e.f((Object)serialDescriptor, "descriptor");
    }
    
    public ee6 d0(final SerialDescriptor serialDescriptor) {
        e0e.f((Object)serialDescriptor, "descriptor");
        return ((Encoder)this).c(serialDescriptor);
    }
    
    public Object f(final Class clazz) {
        final qml i = ((e26)this).I(clazz);
        if (i == null) {
            return null;
        }
        return i.get();
    }
    
    public void f0(final SerialDescriptor serialDescriptor, final int n, final short n2) {
        e0e.f((Object)serialDescriptor, "descriptor");
        this.n0(serialDescriptor, n);
        this.F(n2);
    }
    
    public x1 g(final d2 d2) {
        e0e.f((Object)d2, "object");
        return (x1)this;
    }
    
    public void g0(final SerialDescriptor serialDescriptor, final int n, final double n2) {
        e0e.f((Object)serialDescriptor, "descriptor");
        this.n0(serialDescriptor, n);
        this.i(n2);
    }
    
    public void i(final double n) {
        this.o0(n);
        throw null;
    }
    
    public void i0(final SerialDescriptor serialDescriptor, final int n, final long n2) {
        e0e.f((Object)serialDescriptor, "descriptor");
        this.n0(serialDescriptor, n);
        this.w(n2);
    }
    
    public abstract void j(final byte p0);
    
    public void k0(final w1 w1) {
        this.p0(w1);
    }
    
    public x1 l(final Collection collection) {
        e0e.f((Object)collection, "objects");
        return (x1)this;
    }
    
    public void l0(final String s) {
        e0e.f((Object)s, "value");
        this.o0(s);
        throw null;
    }
    
    public abstract q9h m0(final aah p0, final ByteBuffer p1);
    
    public q9h n(final aah aah) {
        final ByteBuffer h0 = ((DecoderInputBuffer)aah).H0;
        Objects.requireNonNull(h0);
        omi.m(h0.position() == 0 && h0.hasArray() && h0.arrayOffset() == 0);
        q9h m0;
        if (((dr2)aah).p()) {
            m0 = null;
        }
        else {
            m0 = this.m0(aah, h0);
        }
        return m0;
    }
    
    public void n0(final SerialDescriptor serialDescriptor, final int n) {
        e0e.f((Object)serialDescriptor, "descriptor");
    }
    
    public Set o(final Class clazz) {
        return (Set)((e26)this).m(clazz).get();
    }
    
    public void o0(final Object o) {
        e0e.f(o, "value");
        final StringBuilder f = ehk.f("Non-serializable ");
        f.append(iam.a((Class)o.getClass()));
        f.append(" is not supported by ");
        f.append(iam.a((Class)this.getClass()));
        f.append(" encoder");
        throw new SerializationException(f.toString());
    }
    
    public abstract void p0(final w1 p0);
    
    public abstract View q0(final int p0);
    
    public abstract boolean r0();
    
    public abstract bte s0(final bte p0);
    
    public void u(final SerialDescriptor serialDescriptor, final int n) {
        e0e.f((Object)serialDescriptor, "enumDescriptor");
        this.o0(n);
        throw null;
    }
    
    public Encoder v(final SerialDescriptor serialDescriptor) {
        e0e.f((Object)serialDescriptor, "inlineDescriptor");
        return (Encoder)this;
    }
    
    public abstract void w(final long p0);
    
    public void y(final SerialDescriptor serialDescriptor, final int n, final fmp fmp, final Object o) {
        e0e.f((Object)serialDescriptor, "descriptor");
        e0e.f((Object)fmp, "serializer");
        this.n0(serialDescriptor, n);
        Encoder$a.a((Encoder)this, fmp, o);
    }
    
    public boolean z(final SerialDescriptor serialDescriptor) {
        e0e.f((Object)serialDescriptor, "descriptor");
        return true;
    }
}
