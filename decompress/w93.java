import android.view.View;
import java.util.List;
import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w93 implements fa4
{
    public final coa F0;
    public q4 G0;
    public Collection<d2> H0;
    
    public w93(final ViewGroup viewGroup) {
        final coa f0 = (coa)((View)viewGroup).findViewById(2131432566);
        vmw.g((Object)f0);
        final coa coa = f0;
        this.F0 = f0;
    }
    
    public final void a(final q4 q4, final a3 a3) {
        final b3 w0 = a3.w0();
        if (d4j.a0(a3)) {
            final uww uww = (uww)a3;
        }
        Uri parse = null;
        qyw qyw;
        if (w0 != null) {
            qyw = new qyw(w0);
        }
        else {
            qyw = null;
        }
        if (qyw != null) {
            final b3 a4 = qyw.a;
            if (a4 != null && a4 instanceof lyw) {
                final Context context = ((View)this.F0).getContext();
                final b3 a5 = qyw.a;
                String q5;
                if (a5 != null) {
                    q5 = a5.q();
                }
                else {
                    q5 = null;
                }
                if (q5 != null) {
                    parse = Uri.parse(q5);
                }
                if (parse != null) {
                    final coa f0 = this.F0;
                    final String string = context.getString(2131959572);
                    final b3 a6 = qyw.a;
                    String actionText = null;
                    if (a6 == null) {
                        actionText = string;
                    }
                    else {
                        switch (((Enum)a6.getType()).ordinal()) {
                            default: {
                                actionText = context.getString(2131959572);
                                break;
                            }
                            case 6: {
                                actionText = context.getString(2131959578);
                                break;
                            }
                            case 5: {
                                actionText = context.getString(2131959579, new Object[] { qyw.a() });
                                break;
                            }
                            case 4: {
                                actionText = context.getString(2131959573, new Object[] { qyw.a() });
                                break;
                            }
                            case 3: {
                                actionText = context.getString(2131959576, new Object[] { qyw.a() });
                                break;
                            }
                            case 2: {
                                actionText = context.getString(2131959577, new Object[] { qyw.a() });
                                break;
                            }
                            case 1: {
                                actionText = context.getString(2131959575, new Object[] { qyw.a() });
                                break;
                            }
                        }
                    }
                    f0.setActionText(actionText);
                }
                q4.e.k0((w1)new oyw(a3));
                this.F0.setEventListener((coa$a)new b(q4, a3));
                ((View)this.F0).setVisibility(0);
                return;
            }
        }
        ((View)this.F0).setVisibility(8);
    }
    
    public final void g(final q4 g0) {
        this.G0 = g0;
        final List w = ojf.w((Object)new esg((esg$a)new jf8((Object)this, (Object)g0, 3)), (Object[])new d2[] { (d2)new rok((rok$a)new rok$a(this, g0) {
                public final q4 F0;
                public final w93 G0;
                
                public final void b() {
                }
                
                public final void d(final a3 a3, final r5 r5) {
                    this.G0.a(this.F0, a3);
                }
                
                public final void e(final a3 a3) {
                }
                
                public final void g() {
                }
                
                public final void j(final a3 a3) {
                }
                
                public final void k() {
                }
            }) });
        this.H0 = w;
        this.G0.e.l((Collection)w);
    }
    
    public final void h() {
        this.F0.setActionText("");
        this.F0.setEventListener((coa$a)null);
        ((View)this.F0).setVisibility(8);
    }
    
    public final void unbind() {
        final q4 g0 = this.G0;
        if (g0 != null) {
            final List h0 = this.H0;
            if (h0 != null) {
                g0.e.Y((Collection)h0);
            }
        }
    }
    
    public static final class b implements coa$a
    {
        public final q4 a;
        public final a3 b;
        
        public b(final q4 a, final a3 b) {
            this.a = a;
            this.b = b;
        }
    }
}
