// 
// Decompiled by Procyon v0.6.0
// 

public abstract class qqp
{
    public final boolean a;
    
    public qqp() {
        this.a = false;
    }
    
    public boolean a() {
        return this.a;
    }
    
    public static final class a extends qqp
    {
        public static final a b;
        
        static {
            b = new a();
        }
    }
    
    public static final class b extends qqp
    {
        public static final b b;
        
        static {
            b = new b();
        }
    }
    
    public static final class c extends qqp
    {
        public static final c b;
        
        static {
            b = new c();
        }
    }
    
    public static final class d extends qqp
    {
        public static final d b;
        
        static {
            b = new d();
        }
    }
    
    public static final class e extends qqp
    {
        public static final e b;
        
        static {
            b = new e();
        }
    }
    
    public static final class f extends qqp
    {
        public static final f b;
        
        static {
            b = new f();
        }
    }
    
    public static final class g extends qqp
    {
        public static final g b;
        
        static {
            b = new g();
        }
    }
    
    public static final class h extends qqp
    {
        public static final h b;
        
        static {
            b = new h();
        }
    }
    
    public static final class i extends qqp
    {
        public static final i b;
        
        static {
            b = new i();
        }
    }
    
    public static final class j extends qqp
    {
        public final f1a b;
        public final boolean c;
        
        public j(final f1a b, final boolean c) {
            czd.f((Object)b, "emojiType");
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean a() {
            return this.c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof j)) {
                return false;
            }
            final j j = (j)o;
            return this.b == j.b && this.c == j.c;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.b.hashCode();
            int c;
            if ((c = (this.c ? 1 : 0)) != 0) {
                c = 1;
            }
            return hashCode * 31 + c;
        }
        
        @Override
        public final String toString() {
            final f1a b = this.b;
            final boolean c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Reaction(emojiType=");
            sb.append(b);
            sb.append(", hasLongPress=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class k extends qqp
    {
        public final l0a b;
        public final f1a c;
        
        public k(final l0a b, final f1a c) {
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof k)) {
                return false;
            }
            final k k = (k)o;
            return this.b == k.b && this.c == k.c;
        }
        
        @Override
        public final int hashCode() {
            return this.c.hashCode() + this.b.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final l0a b = this.b;
            final f1a c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("ReactionColor(color=");
            sb.append(b);
            sb.append(", emoji=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class l extends qqp
    {
        public static final l b;
        
        static {
            b = new l();
        }
    }
    
    public static final class m extends qqp
    {
        public static final m b;
        
        static {
            b = new m();
        }
    }
    
    public static final class n extends qqp
    {
        public static final n b;
        
        static {
            b = new n();
        }
    }
    
    public static final class o extends qqp
    {
        public static final o b;
        
        static {
            b = new o();
        }
    }
    
    public static final class p extends qqp
    {
        public static final p b;
        
        static {
            b = new p();
        }
    }
    
    public static final class q extends qqp
    {
        public static final q b;
        
        static {
            b = new q();
        }
    }
    
    public static final class r extends qqp
    {
        public static final r b;
        
        static {
            b = new r();
        }
    }
    
    public static final class s extends qqp
    {
        public static final s b;
        
        static {
            b = new s();
        }
    }
    
    public static final class t extends qqp
    {
        public static final t b;
        
        static {
            b = new t();
        }
    }
    
    public static final class u extends qqp
    {
        public static final u b;
        
        static {
            b = new u();
        }
    }
    
    public static final class v extends qqp
    {
        public static final v b;
        
        static {
            b = new v();
        }
    }
}
