// 
// Decompiled by Procyon v0.6.0
// 

public final class gui
{
    public static final class a extends h4j<gui>
    {
        public String a;
        public String b;
        public String[] c;
        public String[] d;
        public String[] e;
        public String f;
        public boolean g;
        public int h;
        
        public a() {
            this.h = -1;
        }
        
        public final Object i() {
            this.h = hr4.f((Object[])this.c, (Object)"off");
            if (!this.g) {
                hr4.f((Object[])this.c, (Object)this.f);
            }
            return new gui();
        }
        
        public final boolean l() {
            final String a = this.a;
            final boolean b = true;
            boolean b2;
            if (b2 = (a != null && this.b != null && this.c != null && this.d != null && this.e != null && this.f != null)) {
                b2 = (hr4.f((Object[])this.c, (Object)"off") > -1 && hr4.f((Object[])this.c, (Object)this.f) > -1 && b);
            }
            return b2;
        }
    }
}
