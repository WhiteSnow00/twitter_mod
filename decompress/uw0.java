// 
// Decompiled by Procyon v0.6.0
// 

public final class uw0
{
    public final qeg<b, a> a;
    public final k7q<b, a> b;
    public final h6q c;
    
    public uw0() {
        this.a = (qeg<b, a>)new qeg();
        this.b = (k7q<b, a>)new k7q(0, 1, (hg8)null);
        this.c = new h6q();
    }
    
    public static void a(final uw0 uw0, kkb c, final fhk fhk, final Object o) {
        fhk.b();
        final b b = new b(c, null);
        c = (kkb)uw0.c;
        monitorenter(c);
        Label_0084: {
            Label_0058: {
                if (o == null) {
                    Label_0087: {
                        try {
                            final a a = (a)uw0.b.e((Object)b, (Object)new a(null));
                            break Label_0084;
                        }
                        finally {
                            break Label_0087;
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
    
    public final Object b(final kkb kkb, fhk invoke, final boolean b, rtb<? super ap6<Object>, ?> c, final ap6<Object> ap6) {
        vw0 vw2 = null;
        Label_0059: {
            if (c instanceof vw0) {
                final vw0 vw0 = (vw0)c;
                final int h0 = vw0.H0;
                if ((h0 & Integer.MIN_VALUE) != 0x0) {
                    vw0.H0 = h0 + Integer.MIN_VALUE;
                    vw2 = vw0;
                    break Label_0059;
                }
            }
            vw2 = new vw0(this, (ap6)c);
        }
        final Object f0 = vw2.F0;
        final zy6 c2 = zy6.C0;
        final int h2 = vw2.H0;
        boolean e0 = false;
        Label_0267: {
            if (h2 != 0) {
                if (h2 == 1) {
                    e0 = vw2.E0;
                    final b d0 = vw2.D0;
                    final uw0 c3 = vw2.C0;
                    kq9.b1(f0);
                    invoke = f0;
                    break Label_0267;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kq9.b1(f0);
            ((fhk)invoke).b();
            final b d2 = new b(kkb, null);
            synchronized (this.c) {
                a a;
                if ((a = (a)this.a.a((Object)d2)) == null) {
                    a = (a)this.b.a((Object)d2);
                }
                if (a != null) {
                    return a.a;
                }
                monitorexit(this.c);
                vw2.C0 = this;
                vw2.D0 = d2;
                vw2.E0 = false;
                vw2.H0 = 1;
                invoke = ((zv0.zv0$b)b).invoke(vw2);
                if (invoke == c2) {
                    return c2;
                }
                final b b2 = d2;
                final uw0 c3 = this;
                final b d0 = b2;
                c = c3.c;
                monitorenter(c);
                Label_0311: {
                    if (invoke == null) {
                        Label_0372: {
                            try {
                                c3.b.e((Object)d0, (Object)new a(null));
                                return invoke;
                            }
                            finally {
                                break Label_0372;
                            }
                            break Label_0311;
                        }
                        monitorexit(c);
                    }
                }
                if (e0) {
                    c3.b.e((Object)d0, (Object)new a(invoke));
                }
                else {
                    c3.a.b((Object)d0, (Object)new a(invoke));
                }
                return invoke;
            }
        }
    }
    
    public static final class a
    {
        public final Object a = a;
        
        @Override
        public final boolean equals(final Object o) {
            final Object a = this.a;
            final boolean b = o instanceof a;
            boolean b2 = false;
            if (b) {
                if (zzd.a(a, ((a)o).a)) {
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
        public final kkb a;
        public final Object b;
        
        public b(final kkb a, final Object b) {
            zzd.f((Object)a, "font");
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
            return zzd.a((Object)this.a, (Object)b.a) && zzd.a(this.b, b.b);
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
            final StringBuilder g = w48.g("Key(font=");
            g.append(this.a);
            g.append(", loaderKey=");
            return dia.s(g, this.b, ')');
        }
    }
}
