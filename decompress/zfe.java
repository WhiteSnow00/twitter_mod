import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class zfe extends lzb
{
    public static final int[] N0;
    public final k3d I0;
    public int[] J0;
    public int K0;
    public kmp L0;
    public boolean M0;
    
    static {
        N0 = du3.h;
    }
    
    public zfe(final k3d i0, final int n) {
        super(n);
        this.J0 = zfe.N0;
        this.L0 = ck8.F0;
        this.I0 = i0;
        if (yfe$a.O0.b(n)) {
            this.K0 = 127;
        }
        this.M0 = (yfe$a.K0.b(n) ^ true);
    }
    
    public final void B0(final String s) throws IOException {
        this.a(String.format("Can not %s, expecting field name (context: %s)", s, super.H0.g()));
        throw null;
    }
    
    public final void u0(final String s, final String s2) throws IOException {
        this.i(s);
        this.s0(s2);
    }
}
