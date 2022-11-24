import android.view.View;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gul extends b4e<dul, a>
{
    public gul() {
        super((Class)dul.class);
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final a a = (a)n8x;
        final dul dul = (dul)o;
        e0e.f((Object)a, "viewHolder");
        e0e.f((Object)dul, "item");
        final TextView h0 = a.H0;
        final boolean b = dul instanceof dul$g;
        boolean b2 = true;
        String text;
        if (b) {
            text = a.G0.getString(2131953536);
            e0e.e((Object)text, "{\n                    re\u2026ipants)\n                }");
        }
        else if (e0e.a((Object)dul, (Object)dul$h.b)) {
            text = a.G0.getString(2131955042);
            e0e.e((Object)text, "{\n                    re\u2026rofile)\n                }");
        }
        else if (dul instanceof dul$b) {
            text = a.G0.getString(2131955071);
            e0e.e((Object)text, "{\n                    re\u2026sation)\n                }");
        }
        else if (dul instanceof dul$c) {
            text = a.G0.getString(2131955068);
            e0e.e((Object)text, "{\n                    re\u2026sation)\n                }");
        }
        else if (e0e.a((Object)dul, (Object)dul$d.b)) {
            text = a.G0.getString(2131953389);
            e0e.e((Object)text, "{\n                    re\u2026action)\n                }");
        }
        else if (dul instanceof dul$e) {
            text = a.G0.getString(2131953392, new Object[] { ((dul$e)dul).b });
            e0e.e((Object)text, "{\n                    re\u2026      )\n                }");
        }
        else if (dul instanceof dul$a) {
            text = a.G0.getString(2131955039, new Object[] { ((dul$a)dul).b });
            e0e.e((Object)text, "{\n                    re\u2026      )\n                }");
        }
        else {
            if (!(dul instanceof dul$f)) {
                throw new NoWhenBranchMatchedException();
            }
            text = a.G0.getString(2131955041, new Object[] { ((dul$f)dul).b });
            e0e.e((Object)text, "{\n                    re\u2026      )\n                }");
        }
        h0.setText((CharSequence)text);
        final ImageView i0 = a.I0;
        int imageResource;
        if (b) {
            imageResource = 2131232314;
        }
        else if (e0e.a((Object)dul, (Object)dul$h.b)) {
            imageResource = 2131232328;
        }
        else if (dul instanceof dul$b) {
            imageResource = 2131232068;
        }
        else if (dul instanceof dul$c) {
            imageResource = 2131232513;
        }
        else {
            if (!e0e.a((Object)dul, (Object)dul$d.b)) {
                b2 = (dul instanceof dul$e);
            }
            if (b2) {
                imageResource = 2131232086;
            }
            else if (dul instanceof dul$f) {
                imageResource = 2131232530;
            }
            else {
                if (!(dul instanceof dul$a)) {
                    throw new NoWhenBranchMatchedException();
                }
                imageResource = 2131232273;
            }
        }
        i0.setImageResource(imageResource);
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        e0e.f((Object)viewGroup, "parent");
        return (n8x)new a(viewGroup);
    }
    
    public final class a extends sl8
    {
        public final Resources G0;
        public final TextView H0;
        public final ImageView I0;
        
        public a(final ViewGroup viewGroup) {
            e0e.f((Object)viewGroup, "parent");
            final View inflate = LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131625993, viewGroup, false);
            e0e.e((Object)inflate, "from(parent.context)\n   \u2026ck_action, parent, false)");
            super(inflate);
            final Resources resources = inflate.getResources();
            e0e.e((Object)resources, "view.resources");
            this.G0 = resources;
            final View viewById = inflate.findViewById(2131432077);
            e0e.e((Object)viewById, "view.findViewById(R.id.title)");
            this.H0 = (TextView)viewById;
            final View viewById2 = inflate.findViewById(2131429506);
            e0e.e((Object)viewById2, "view.findViewById(R.id.icon)");
            this.I0 = (ImageView)viewById2;
        }
    }
}
