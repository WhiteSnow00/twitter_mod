import java.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.io.Writer;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gke extends xle
{
    public static final gke$a U0;
    public static final yhe V0;
    public final List<gfe> R0;
    public String S0;
    public gfe T0;
    
    static {
        U0 = new gke$a();
        V0 = new yhe("closed");
    }
    
    public gke() {
        super((Writer)gke.U0);
        this.R0 = new ArrayList();
        this.T0 = ghe.a;
    }
    
    public final xle K(final long n) throws IOException {
        this.i0((gfe)new yhe((Number)n));
        return this;
    }
    
    public final xle L(final Boolean b) throws IOException {
        if (b == null) {
            this.i0(ghe.a);
            return this;
        }
        this.i0((gfe)new yhe(b));
        return this;
    }
    
    public final xle N(final Number n) throws IOException {
        if (n == null) {
            this.i0(ghe.a);
            return this;
        }
        if (!super.K0) {
            final double doubleValue = n.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("JSON forbids NaN and infinities: ");
                sb.append(n);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.i0((gfe)new yhe(n));
        return this;
    }
    
    public final xle P(final String s) throws IOException {
        if (s == null) {
            this.i0(ghe.a);
            return this;
        }
        this.i0((gfe)new yhe(s));
        return this;
    }
    
    public final xle T(final boolean b) throws IOException {
        this.i0((gfe)new yhe(Boolean.valueOf(b)));
        return this;
    }
    
    public final gfe Z() {
        final ArrayList r0 = this.R0;
        return (gfe)r0.get(r0.size() - 1);
    }
    
    public final xle b() throws IOException {
        final kde kde = new kde();
        this.i0(kde);
        this.R0.add(kde);
        return this;
    }
    
    public final xle c() throws IOException {
        final ihe ihe = new ihe();
        this.i0((gfe)ihe);
        this.R0.add(ihe);
        return this;
    }
    
    public final void close() throws IOException {
        if (this.R0.isEmpty()) {
            this.R0.add(gke.V0);
            return;
        }
        throw new IOException("Incomplete document");
    }
    
    public final xle e() throws IOException {
        if (this.R0.isEmpty() || this.S0 != null) {
            throw new IllegalStateException();
        }
        if (this.Z() instanceof kde) {
            final ArrayList r0 = this.R0;
            r0.remove(r0.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }
    
    public final xle f() throws IOException {
        if (this.R0.isEmpty() || this.S0 != null) {
            throw new IllegalStateException();
        }
        if (this.Z() instanceof ihe) {
            final ArrayList r0 = this.R0;
            r0.remove(r0.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }
    
    public final void flush() throws IOException {
    }
    
    public final xle h(final String s0) throws IOException {
        Objects.requireNonNull(s0, "name == null");
        if (this.R0.isEmpty() || this.S0 != null) {
            throw new IllegalStateException();
        }
        if (this.Z() instanceof ihe) {
            this.S0 = s0;
            return this;
        }
        throw new IllegalStateException();
    }
    
    public final void i0(final gfe t0) {
        if (this.S0 != null) {
            if (!(t0 instanceof ghe) || super.N0) {
                ((ihe)this.Z()).a.put((Object)this.S0, (Object)t0);
            }
            this.S0 = null;
        }
        else if (this.R0.isEmpty()) {
            this.T0 = t0;
        }
        else {
            final gfe z = this.Z();
            if (!(z instanceof kde)) {
                throw new IllegalStateException();
            }
            ((kde)z).F0.add(t0);
        }
    }
    
    public final xle j() throws IOException {
        this.i0(ghe.a);
        return this;
    }
    
    public final xle z(final double n) throws IOException {
        if (!super.K0 && (Double.isNaN(n) || Double.isInfinite(n))) {
            final StringBuilder sb = new StringBuilder();
            sb.append("JSON forbids NaN and infinities: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        this.i0((gfe)new yhe((Number)n));
        return this;
    }
}
