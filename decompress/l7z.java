import android.os.Build;
import java.util.List;
import java.util.Objects;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l7z extends clz implements ooz
{
    public static final int zza = 0;
    private static final l7z zze;
    private boolean zzA;
    private String zzB;
    private long zzC;
    private int zzD;
    private String zzE;
    private String zzF;
    private boolean zzG;
    private rlz zzH;
    private String zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private String zzM;
    private long zzN;
    private long zzO;
    private String zzP;
    private String zzQ;
    private int zzR;
    private String zzS;
    private w7z zzT;
    private mlz zzU;
    private long zzV;
    private long zzW;
    private String zzX;
    private String zzY;
    private int zzZ;
    private boolean zzaa;
    private String zzab;
    private boolean zzac;
    private d6z zzad;
    private String zzae;
    private rlz zzaf;
    private String zzag;
    private int zzf;
    private int zzg;
    private int zzh;
    private rlz zzi;
    private rlz zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private int zzt;
    private String zzu;
    private String zzv;
    private String zzw;
    private long zzx;
    private long zzy;
    private String zzz;
    
    static {
        clz.p(l7z.class, zze = new l7z());
    }
    
    public l7z() {
        final jpz g0 = jpz.G0;
        this.zzi = (rlz)g0;
        this.zzj = (rlz)g0;
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzs = "";
        this.zzu = "";
        this.zzv = "";
        this.zzw = "";
        this.zzz = "";
        this.zzB = "";
        this.zzE = "";
        this.zzF = "";
        this.zzH = (rlz)g0;
        this.zzI = "";
        this.zzM = "";
        this.zzP = "";
        this.zzQ = "";
        this.zzS = "";
        this.zzU = (mlz)elz.G0;
        this.zzX = "";
        this.zzY = "";
        this.zzab = "";
        this.zzae = "";
        this.zzaf = (rlz)g0;
        this.zzag = "";
    }
    
    public static void A0(final l7z l7z, final int n, final s8z s8z) {
        l7z.T0();
        l7z.zzj.set(n, s8z);
    }
    
    public static void B0(final l7z l7z, final s8z s8z) {
        l7z.T0();
        l7z.zzj.add(s8z);
    }
    
    public static void C0(final l7z l7z, final int n) {
        l7z.T0();
        l7z.zzj.remove(n);
    }
    
    public static void D0(final l7z l7z, final long zzk) {
        l7z.zzf |= 0x2;
        l7z.zzk = zzk;
    }
    
    public static void E0(final l7z l7z, final long zzl) {
        l7z.zzf |= 0x4;
        l7z.zzl = zzl;
    }
    
    public static void F0(final l7z l7z, final long zzm) {
        l7z.zzf |= 0x8;
        l7z.zzm = zzm;
    }
    
    public static h7z F1() {
        return (h7z)l7z.zze.j();
    }
    
    public static void G0(final l7z l7z, final long zzn) {
        l7z.zzf |= 0x10;
        l7z.zzn = zzn;
    }
    
    public static l7z G1() {
        return l7z.zze;
    }
    
    public static void H0(final l7z l7z) {
        l7z.zzf &= 0xFFFFFFEF;
        l7z.zzn = 0L;
    }
    
    public static void I(final l7z l7z, final long zzO) {
        l7z.zzf |= 0x40000000;
        l7z.zzO = zzO;
    }
    
    public static void I0(final l7z l7z, final long zzo) {
        l7z.zzf |= 0x20;
        l7z.zzo = zzo;
    }
    
    public static void J(final l7z l7z) {
        l7z.zzf &= Integer.MAX_VALUE;
        l7z.zzP = l7z.zze.zzP;
    }
    
    public static void J0(final l7z l7z) {
        l7z.zzf &= 0xFFFFFFDF;
        l7z.zzo = 0L;
    }
    
    public static void K(final l7z l7z, final int zzR) {
        l7z.zzg |= 0x2;
        l7z.zzR = zzR;
    }
    
    public static void K0(final l7z l7z) {
        l7z.zzf |= 0x40;
        l7z.zzp = "android";
    }
    
    public static void L(final l7z l7z, final int n, final h5z h5z) {
        l7z.S0();
        l7z.zzi.set(n, h5z);
    }
    
    public static void L0(final l7z l7z) {
        final String release = Build$VERSION.RELEASE;
        Objects.requireNonNull(release);
        l7z.zzf |= 0x80;
        l7z.zzq = release;
    }
    
    public static void M(final l7z l7z, final String zzS) {
        Objects.requireNonNull(zzS);
        l7z.zzg |= 0x4;
        l7z.zzS = zzS;
    }
    
    public static void M0(final l7z l7z) {
        l7z.zzf &= 0xFFFFFF7F;
        l7z.zzq = l7z.zze.zzq;
    }
    
    public static void N(final l7z l7z, final Iterable iterable) {
        final mlz zzU = l7z.zzU;
        if (!((ufz)zzU).D0) {
            final elz elz = (elz)zzU;
            final int f0 = elz.F0;
            int n;
            if (f0 == 0) {
                n = 10;
            }
            else {
                n = f0 + f0;
            }
            l7z.zzU = elz.i(n);
        }
        tfz.g(iterable, (List)l7z.zzU);
    }
    
    public static void N0(final l7z l7z) {
        final String model = Build.MODEL;
        Objects.requireNonNull(model);
        l7z.zzf |= 0x100;
        l7z.zzr = model;
    }
    
    public static void O(final l7z l7z, final h5z h5z) {
        l7z.S0();
        l7z.zzi.add(h5z);
    }
    
    public static void O0(final l7z l7z) {
        l7z.zzf &= 0xFFFFFEFF;
        l7z.zzr = l7z.zze.zzr;
    }
    
    public static void P(final l7z l7z, final long zzV) {
        l7z.zzg |= 0x10;
        l7z.zzV = zzV;
    }
    
    public static void P0(final l7z l7z, final String zzs) {
        Objects.requireNonNull(zzs);
        l7z.zzf |= 0x200;
        l7z.zzs = zzs;
    }
    
    public static void Q(final l7z l7z, final long zzW) {
        l7z.zzg |= 0x20;
        l7z.zzW = zzW;
    }
    
    public static void Q0(final l7z l7z, final int zzt) {
        l7z.zzf |= 0x400;
        l7z.zzt = zzt;
    }
    
    public static void S(final l7z l7z, final String zzu) {
        Objects.requireNonNull(zzu);
        l7z.zzf |= 0x800;
        l7z.zzu = zzu;
    }
    
    public static void T(final l7z l7z, final String zzv) {
        Objects.requireNonNull(zzv);
        l7z.zzf |= 0x1000;
        l7z.zzv = zzv;
    }
    
    public static void U(final l7z l7z, final String zzw) {
        Objects.requireNonNull(zzw);
        l7z.zzf |= 0x2000;
        l7z.zzw = zzw;
    }
    
    public static void V(final l7z l7z, final long zzx) {
        l7z.zzf |= 0x4000;
        l7z.zzx = zzx;
    }
    
    public static void W(final l7z l7z) {
        l7z.zzf |= 0x8000;
        l7z.zzy = 64000L;
    }
    
    public static void X(final l7z l7z, final String zzz) {
        Objects.requireNonNull(zzz);
        l7z.zzf |= 0x10000;
        l7z.zzz = zzz;
    }
    
    public static void Y(final l7z l7z) {
        l7z.zzf &= 0xFFFEFFFF;
        l7z.zzz = l7z.zze.zzz;
    }
    
    public static void Z(final l7z l7z, final boolean zzA) {
        l7z.zzf |= 0x20000;
        l7z.zzA = zzA;
    }
    
    public static void a0(final l7z l7z) {
        l7z.zzf &= 0xFFFDFFFF;
        l7z.zzA = false;
    }
    
    public static void b0(final l7z l7z, final String zzB) {
        l7z.zzf |= 0x40000;
        l7z.zzB = zzB;
    }
    
    public static void c0(final l7z l7z) {
        l7z.zzf &= 0xFFFBFFFF;
        l7z.zzB = l7z.zze.zzB;
    }
    
    public static void d0(final l7z l7z, final long zzC) {
        l7z.zzf |= 0x80000;
        l7z.zzC = zzC;
    }
    
    public static void e0(final l7z l7z, final int zzD) {
        l7z.zzf |= 0x100000;
        l7z.zzD = zzD;
    }
    
    public static void f0(final l7z l7z, final String zzE) {
        l7z.zzf |= 0x200000;
        l7z.zzE = zzE;
    }
    
    public static void g0(final l7z l7z) {
        l7z.zzf &= 0xFFDFFFFF;
        l7z.zzE = l7z.zze.zzE;
    }
    
    public static void h0(final l7z l7z, final String zzF) {
        Objects.requireNonNull(zzF);
        l7z.zzf |= 0x400000;
        l7z.zzF = zzF;
    }
    
    public static void i0(final l7z l7z) {
        l7z.zzf |= 0x800000;
        l7z.zzG = false;
    }
    
    public static void j0(final l7z l7z, final Iterable iterable) {
        final rlz zzH = l7z.zzH;
        if (!zzH.d()) {
            l7z.zzH = clz.n(zzH);
        }
        tfz.g(iterable, (List)l7z.zzH);
    }
    
    public static void k0(final l7z l7z) {
        l7z.zzH = (rlz)jpz.G0;
    }
    
    public static void l0(final l7z l7z, final String zzI) {
        l7z.zzf |= 0x1000000;
        l7z.zzI = zzI;
    }
    
    public static void m0(final l7z l7z, final int zzJ) {
        l7z.zzf |= 0x2000000;
        l7z.zzJ = zzJ;
    }
    
    public static void n0(final l7z l7z) {
        l7z.zzf |= 0x1;
        l7z.zzh = 1;
    }
    
    public static void o0(final l7z l7z) {
        l7z.zzf &= 0xEFFFFFFF;
        l7z.zzM = l7z.zze.zzM;
    }
    
    public static void p0(final l7z l7z, final long zzN) {
        l7z.zzf |= 0x20000000;
        l7z.zzN = zzN;
    }
    
    public static void s0(final l7z l7z, final String zzY) {
        l7z.zzg |= 0x80;
        l7z.zzY = zzY;
    }
    
    public static void t0(final l7z l7z, final Iterable iterable) {
        l7z.S0();
        tfz.g(iterable, (List)l7z.zzi);
    }
    
    public static void u0(final l7z l7z, final String zzae) {
        Objects.requireNonNull(zzae);
        l7z.zzg |= 0x2000;
        l7z.zzae = zzae;
    }
    
    public static void v0(final l7z l7z) {
        l7z.zzg &= 0xFFFFDFFF;
        l7z.zzae = l7z.zze.zzae;
    }
    
    public static void w0(final l7z l7z, final Iterable iterable) {
        final rlz zzaf = l7z.zzaf;
        if (!zzaf.d()) {
            l7z.zzaf = clz.n(zzaf);
        }
        tfz.g(iterable, (List)l7z.zzaf);
    }
    
    public static void x0(final l7z l7z) {
        l7z.zzi = (rlz)jpz.G0;
    }
    
    public static void y0(final l7z l7z, final String zzag) {
        Objects.requireNonNull(zzag);
        l7z.zzg |= 0x4000;
        l7z.zzag = zzag;
    }
    
    public static void z0(final l7z l7z, final int n) {
        l7z.S0();
        l7z.zzi.remove(n);
    }
    
    public final String A() {
        return this.zzq;
    }
    
    public final long A1() {
        return this.zzn;
    }
    
    public final String B() {
        return this.zzp;
    }
    
    public final long B1() {
        return this.zzl;
    }
    
    public final String C() {
        return this.zzz;
    }
    
    public final long C1() {
        return this.zzk;
    }
    
    public final String D() {
        return this.zzae;
    }
    
    public final long D1() {
        return this.zzy;
    }
    
    public final String E() {
        return this.zzs;
    }
    
    public final h5z E1(final int n) {
        return this.zzi.get(n);
    }
    
    public final List F() {
        return this.zzH;
    }
    
    public final List G() {
        return this.zzi;
    }
    
    public final List H() {
        return this.zzj;
    }
    
    public final s8z H1(final int n) {
        return this.zzj.get(n);
    }
    
    public final String I1() {
        return this.zzS;
    }
    
    public final String J1() {
        return this.zzv;
    }
    
    public final String K1() {
        return this.zzB;
    }
    
    public final int R() {
        return this.zzJ;
    }
    
    public final int R0() {
        return this.zzD;
    }
    
    public final void S0() {
        final rlz zzi = this.zzi;
        if (!zzi.d()) {
            this.zzi = clz.n(zzi);
        }
    }
    
    public final void T0() {
        final rlz zzj = this.zzj;
        if (!zzj.d()) {
            this.zzj = clz.n(zzj);
        }
    }
    
    public final boolean U0() {
        return (this.zzf & 0x40000000) != 0x0;
    }
    
    public final boolean V0() {
        return (this.zzf & 0x2000000) != 0x0;
    }
    
    public final boolean W0() {
        return (this.zzf & 0x100000) != 0x0;
    }
    
    public final boolean X0() {
        return (this.zzf & 0x20000000) != 0x0;
    }
    
    public final boolean Y0() {
        return (this.zzg & 0x80) != 0x0;
    }
    
    public final boolean Z0() {
        return (this.zzf & 0x80000) != 0x0;
    }
    
    public final boolean a1() {
        return (this.zzg & 0x10) != 0x0;
    }
    
    public final boolean b1() {
        return (this.zzf & 0x8) != 0x0;
    }
    
    public final boolean c1() {
        return (this.zzf & 0x4000) != 0x0;
    }
    
    public final boolean d1() {
        return (this.zzf & 0x20000) != 0x0;
    }
    
    public final boolean e1() {
        return (this.zzf & 0x20) != 0x0;
    }
    
    public final boolean f1() {
        return (this.zzf & 0x10) != 0x0;
    }
    
    public final boolean g1() {
        return (this.zzf & 0x1) != 0x0;
    }
    
    public final boolean h1() {
        return (this.zzg & 0x2) != 0x0;
    }
    
    public final boolean i1() {
        return (this.zzf & 0x800000) != 0x0;
    }
    
    public final boolean j1() {
        return (this.zzg & 0x2000) != 0x0;
    }
    
    public final boolean k1() {
        return (this.zzf & 0x4) != 0x0;
    }
    
    public final boolean l1() {
        return (this.zzf & 0x400) != 0x0;
    }
    
    public final boolean m1() {
        return (this.zzf & 0x2) != 0x0;
    }
    
    public final boolean n1() {
        return (this.zzf & 0x8000) != 0x0;
    }
    
    public final int o1() {
        return this.zzi.size();
    }
    
    public final int p1() {
        return this.zzh;
    }
    
    public final boolean q0() {
        return this.zzA;
    }
    
    public final int q1() {
        return this.zzR;
    }
    
    @Override
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new mpz((loz)l7z.zze, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u001b\u0004\u1002\u0001\u0005\u1002\u0002\u0006\u1002\u0003\u0007\u1002\u0005\b\u1008\u0006\t\u1008\u0007\n\u1008\b\u000b\u1008\t\f\u1004\n\r\u1008\u000b\u000e\u1008\f\u0010\u1008\r\u0011\u1002\u000e\u0012\u1002\u000f\u0013\u1008\u0010\u0014\u1007\u0011\u0015\u1008\u0012\u0016\u1002\u0013\u0017\u1004\u0014\u0018\u1008\u0015\u0019\u1008\u0016\u001a\u1002\u0004\u001c\u1007\u0017\u001d\u001b\u001e\u1008\u0018\u001f\u1004\u0019 \u1004\u001a!\u1004\u001b\"\u1008\u001c#\u1002\u001d$\u1002\u001e%\u1008\u001f&\u1008 '\u1004!)\u1008\",\u1009#-\u001d.\u1002$/\u1002%2\u1008&4\u1008'5\u100c(7\u1007)9\u1008*:\u1007+;\u1009,?\u1008-@\u001aA\u1008.", new Object[] { "zzf", "zzg", "zzh", "zzi", h5z.class, "zzj", s8z.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", r4z.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", c4z.a, "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag" });
        }
        if (n == 3) {
            return new l7z();
        }
        if (n == 4) {
            return new h7z(null);
        }
        if (n != 5) {
            return null;
        }
        return l7z.zze;
    }
    
    public final boolean r0() {
        return this.zzG;
    }
    
    public final int r1() {
        return this.zzt;
    }
    
    public final String s() {
        return this.zzu;
    }
    
    public final int s1() {
        return this.zzj.size();
    }
    
    public final String t() {
        return this.zzw;
    }
    
    public final long t1() {
        return this.zzO;
    }
    
    public final String u() {
        return this.zzY;
    }
    
    public final long u1() {
        return this.zzN;
    }
    
    public final String v() {
        return this.zzr;
    }
    
    public final long v1() {
        return this.zzC;
    }
    
    public final String w() {
        return this.zzP;
    }
    
    public final long w1() {
        return this.zzV;
    }
    
    public final String x() {
        return this.zzI;
    }
    
    public final long x1() {
        return this.zzm;
    }
    
    public final String y() {
        return this.zzF;
    }
    
    public final long y1() {
        return this.zzx;
    }
    
    public final String z() {
        return this.zzE;
    }
    
    public final long z1() {
        return this.zzo;
    }
}
