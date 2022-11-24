import android.widget.CompoundButton;
import android.content.res.Resources;
import android.widget.CheckBox;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gse extends sxh<nxh>
{
    public static final int d1 = 0;
    public final View Z0;
    public final TextView a1;
    public final TextView b1;
    public final CheckBox c1;
    
    public gse(final View view) {
        super(view);
        this.Z0 = view.findViewById(2131430189);
        this.a1 = (TextView)view.findViewById(2131429705);
        this.b1 = (TextView)view.findViewById(2131432035);
        this.c1 = (CheckBox)view.findViewById(2131428629);
    }
    
    public final void q0(final fxh fxh, final boolean b) {
        final nxh nxh = (nxh)fxh;
        final cxh a = nxh.a;
        this.a1.setText((CharSequence)a.c);
        final Resources resources = ((View)this.b1).getContext().getResources();
        final TextView b2 = this.b1;
        final long e = a.e;
        final long n = lcmp(e, 0L);
        String text;
        if (n <= 0) {
            text = resources.getString(2131955282);
        }
        else {
            boolean b3 = false;
            Label_0107: {
                if (n > 0) {
                    final g5s a2 = nq1.a;
                    if (e < System.currentTimeMillis()) {
                        b3 = true;
                        break Label_0107;
                    }
                }
                b3 = false;
            }
            if (b3) {
                text = resources.getString(2131955281);
            }
            else {
                final g5s a3 = nq1.a;
                text = rxh.a(resources, e, System.currentTimeMillis());
            }
        }
        b2.setText((CharSequence)text);
        ((View)this.b1).setVisibility(0);
        final long e2 = a.e;
        boolean b4 = false;
        Label_0184: {
            if (e2 > 0L) {
                final g5s a4 = nq1.a;
                if (e2 < System.currentTimeMillis()) {
                    b4 = true;
                    break Label_0184;
                }
            }
            b4 = false;
        }
        if (b4) {
            this.a1.setEnabled(false);
        }
        else {
            this.a1.setEnabled(true);
        }
        if (b) {
            ((View)this.c1).setVisibility(0);
            ((CompoundButton)this.c1).setChecked(nxh.b);
            this.Z0.setActivated(nxh.b);
        }
        else {
            ((CompoundButton)this.c1).setChecked(nxh.b);
            ((View)this.c1).setVisibility(8);
            this.Z0.setActivated(false);
        }
    }
}
