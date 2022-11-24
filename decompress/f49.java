import android.view.View$OnClickListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f49 extends uol
{
    public final Context b;
    
    public f49(final Context b, final p49 p2) {
        super((esi)p2);
        this.b = b;
    }
    
    public final Object a(final Object o) {
        final bti a = (bti)o;
        final int w = a.w;
        final String s = "";
        String s2 = null;
        Label_0190: {
            if (w != 22) {
                Label_0162: {
                    if (w != 253) {
                        if (w != 274) {
                            if (w != 308) {
                                final StringBuilder f = ehk.f("Found DM ambient notification with unrecognized category: ");
                                f.append(a.w);
                                r9a.d((Throwable)new IllegalStateException(f.toString()));
                                if ((s2 = a.e) == null) {
                                    break Label_0162;
                                }
                                break Label_0190;
                            }
                        }
                        else {
                            final ggd l = a.L;
                            if (l != null && !flr.e((CharSequence)l.a)) {
                                s2 = a.L.a;
                                break Label_0190;
                            }
                            s2 = this.b.getString(2131953260, new Object[] { a.i });
                            break Label_0190;
                        }
                    }
                    if ((s2 = a.e) != null) {
                        break Label_0190;
                    }
                }
                s2 = "";
            }
            else {
                s2 = this.b.getString(2131953198, new Object[] { a.i });
            }
        }
        final akq$a akq$a = new akq$a();
        akq$a.a = a;
        akq$a.p(s2);
        final ggd i = a.L;
        String b;
        if (i != null) {
            b = i.b;
        }
        else if (s2.equals(a.e)) {
            b = s;
        }
        else {
            b = null;
        }
        akq$a.c = b;
        akq$a.g = 27;
        akq$a.f = (View$OnClickListener)new v8w((Object)this, (Object)a, 11);
        return ((z4j)akq$a).e();
    }
    
    public static final class a extends uol
    {
        public final Context b;
        
        public a(final xim xim, final Context b) {
            super((esi)xim);
            this.b = b;
        }
        
        public final Object a(final Object o) {
            final bti a = (bti)o;
            final akq$a akq$a = new akq$a();
            e0e.f((Object)a, "notificationInfo");
            akq$a.a = a;
            akq$a.p(this.b.getString(2131957012, new Object[] { a.i }));
            akq$a.g = 9;
            akq$a.f = (View$OnClickListener)new f2p((Object)a, 21);
            return ((z4j)akq$a).e();
        }
    }
    
    public static final class b extends uol
    {
        public final Context b;
        
        public b(final hvm hvm, final Context b) {
            super((esi)hvm);
            this.b = b;
        }
        
        public final Object a(final Object o) {
            final bti a = (bti)o;
            final akq$a akq$a = new akq$a();
            e0e.f((Object)a, "notificationInfo");
            akq$a.a = a;
            akq$a.p(this.b.getString(2131957165, new Object[] { a.i }));
            akq$a.g = 5;
            akq$a.f = (View$OnClickListener)new g2p((Object)a, 16);
            return ((z4j)akq$a).e();
        }
    }
}
