// 
// Decompiled by Procyon v0.6.0
// 

public final class uw0
{
    public final afg<b, a> a;
    public final y8q<b, a> b;
    public final tpz c;
    
    public uw0() {
        this.a = (afg<b, a>)new afg();
        this.b = (y8q<b, a>)new y8q(0, 1, (wg8)null);
        this.c = new tpz();
    }
    
    public static void a(final uw0 uw0, jkb c, final aik aik, final Object o) {
        aik.b();
        final b b = new b(c, null);
        c = (jkb)uw0.c;
        monitorenter(c);
        Label_0085: {
            Label_0058: {
                if (o == null) {
                    Label_0088: {
                        try {
                            final a a = (a)uw0.b.e((Object)b, (Object)new a(null));
                            break Label_0085;
                        }
                        finally {
                            break Label_0088;
                        }
                        break Label_0058;
                    }
                    monitorexit(c);
                }
            }
            final a a2 = (a)uw0.a.b((Object)b, (Object)new a(o));
        }
        monitorexit(c);
    }
    
    public final Object b(final jkb jkb, aik invoke, final boolean b, stb<? super mp6<Object>, ?> c, final mp6<Object> mp6) {
        vw0 vw2 = null;
        Label_0059: {
            if (c instanceof vw0) {
                final vw0 vw0 = (vw0)c;
                final int k0 = vw0.K0;
                if ((k0 & Integer.MIN_VALUE) != 0x0) {
                    vw0.K0 = k0 + Integer.MIN_VALUE;
                    vw2 = vw0;
                    break Label_0059;
                }
            }
            vw2 = new vw0(this, (mp6)c);
        }
        final Object i0 = vw2.I0;
        final jz6 f0 = jz6.F0;
        final int k2 = vw2.K0;
        boolean h0 = false;
        Label_0261: {
            if (k2 != 0) {
                if (k2 == 1) {
                    h0 = vw2.H0;
                    final b g0 = vw2.G0;
                    final uw0 f2 = vw2.F0;
                    jb2.M0(i0);
                    invoke = i0;
                    break Label_0261;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jb2.M0(i0);
            ((aik)invoke).b();
            final b g2 = new b(jkb, null);
            synchronized (this.c) {
                a a;
                if ((a = (a)this.a.a((Object)g2)) == null) {
                    a = (a)this.b.a((Object)g2);
                }
                if (a != null) {
                    return a.a;
                }
                monitorexit(this.c);
                vw2.F0 = this;
                vw2.G0 = g2;
                vw2.H0 = false;
                vw2.K0 = 1;
                invoke = ((wv0$b)b).invoke((Object)vw2);
                if (invoke == f0) {
                    return f0;
                }
                final uw0 f2 = this;
                final b g0 = g2;
                c = f2.c;
                monitorenter(c);
                Label_0305: {
                    if (invoke == null) {
                        Label_0366: {
                            try {
                                f2.b.e((Object)g0, (Object)new a(null));
                                return invoke;
                            }
                            finally {
                                break Label_0366;
                            }
                            break Label_0305;
                        }
                        monitorexit(c);
                    }
                }
                if (h0) {
                    f2.b.e((Object)g0, (Object)new a(invoke));
                }
                else {
                    f2.a.b((Object)g0, (Object)new a(invoke));
                }
                return invoke;
            }
        }
    }
    
    public static final class a
    {
        public final Object a;
        
        public a(final Object a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            final Object a = this.a;
            final boolean b = o instanceof a;
            boolean b2 = false;
            if (b) {
                if (e0e.a(a, ((a)o).a)) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        @Override
        public final int hashCode() {
            final Object a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public final String toString() {
            final Object a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("AsyncTypefaceResult(result=");
            sb.append(a);
            sb.append(')');
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final jkb a;
        public final Object b;
        
        public b(final jkb a, final Object b) {
            e0e.f((Object)a, "font");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return e0e.a((Object)this.a, (Object)b.a) && e0e.a(this.b, b.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final Object b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            return hashCode * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("Key(font=");
            f.append(this.a);
            f.append(", loaderKey=");
            return ad.z(f, this.b, ')');
        }
    }
}
