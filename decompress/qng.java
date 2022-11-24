import android.widget.TextView;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.c;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.g;
import androidx.recyclerview.widget.RecyclerView$r;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qng extends RecyclerView$r
{
    public final g a;
    public final MaterialButton b;
    public final c c;
    
    public qng(final c c, final g a, final MaterialButton b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final RecyclerView recyclerView, final int n) {
        if (n == 0) {
            ((View)recyclerView).announceForAccessibility(((TextView)this.b).getText());
        }
    }
    
    public final void b(final RecyclerView recyclerView, int n, final int n2) {
        if (n < 0) {
            n = this.c.Z1().r1();
        }
        else {
            n = this.c.Z1().t1();
        }
        this.c.G1 = this.a.C(n);
        ((TextView)this.b).setText((CharSequence)this.a.C(n).s());
    }
}
