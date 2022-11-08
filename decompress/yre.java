import android.widget.CompoundButton;
import android.content.res.Resources;
import android.widget.CheckBox;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yre extends zwh<uwh>
{
    public final View W0;
    public final TextView X0;
    public final TextView Y0;
    public final CheckBox Z0;
    
    public yre(final View view) {
        super(view);
        this.W0 = view.findViewById(2131430186);
        this.X0 = (TextView)view.findViewById(2131429704);
        this.Y0 = (TextView)view.findViewById(2131432031);
        this.Z0 = (CheckBox)view.findViewById(2131428629);
    }
    
    public final void q0(final lwh lwh, final boolean b) {
        final uwh uwh = (uwh)lwh;
        final jwh a = uwh.a;
        this.X0.setText((CharSequence)a.c);
        final Resources resources = ((View)this.Y0).getContext().getResources();
        final TextView y0 = this.Y0;
        final long e = a.e;
        final long n = lcmp(e, 0L);
        String text;
        if (n <= 0) {
            text = resources.getString(2131955282);
        }
        else {
            boolean b2 = false;
            Label_0110: {
                if (n > 0) {
                    final t3s a2 = mq1.a;
                    if (e < System.currentTimeMillis()) {
                        b2 = true;
                        break Label_0110;
                    }
                }
                b2 = false;
            }
            if (b2) {
                text = resources.getString(2131955281);
            }
            else {
                final t3s a3 = mq1.a;
                text = ywh.a(resources, e, System.currentTimeMillis());
            }
        }
        y0.setText((CharSequence)text);
        ((View)this.Y0).setVisibility(0);
        final long e2 = a.e;
        boolean b3 = false;
        Label_0190: {
            if (e2 > 0L) {
                final t3s a4 = mq1.a;
                if (e2 < System.currentTimeMillis()) {
                    b3 = true;
                    break Label_0190;
                }
            }
            b3 = false;
        }
        if (b3) {
            this.X0.setEnabled(false);
        }
        else {
            this.X0.setEnabled(true);
        }
        if (b) {
            ((View)this.Z0).setVisibility(0);
            ((CompoundButton)this.Z0).setChecked(uwh.b);
            this.W0.setActivated(uwh.b);
        }
        else {
            ((CompoundButton)this.Z0).setChecked(uwh.b);
            ((View)this.Z0).setVisibility(8);
            this.W0.setActivated(false);
        }
    }
}
