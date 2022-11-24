// 
// Decompiled by Procyon v0.6.0
// 

public interface ren
{
    public static final class a implements ren
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b implements ren
    {
        public final int a;
        
        public b(final int a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && this.a == ((b)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a;
        }
        
        @Override
        public final String toString() {
            return ffe.m("AnimateRaiseHandReaction(sentEmojiRes=", this.a, ")");
        }
    }
    
    public static final class c implements ren
    {
        public final int a;
        
        public c(final int a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && this.a == ((c)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a;
        }
        
        @Override
        public final String toString() {
            return ffe.m("AnimateReaction(sentEmojiRes=", this.a, ")");
        }
    }
    
    public static final class d implements ren
    {
        public static final d a;
        
        static {
            a = new d();
        }
    }
    
    public static final class e implements ren
    {
        public final lrp.j a;
        
        public e(final lrp.j a) {
            e0e.f((Object)a, "settingType");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof e && e0e.a((Object)this.a, (Object)((e)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final lrp.j a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("ShowReactionColorsMenu(settingType=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class f implements ren
    {
        public static final f a;
        
        static {
            a = new f();
        }
    }
}
