import android.view.animation.Animation;
import android.os.Handler;
import java.util.Objects;
import android.view.animation.AnimationUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.content.Context;
import android.widget.ImageView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class do0 implements View$OnClickListener
{
    public final ImageView[] C0;
    public int D0;
    public final Context E0;
    public final a F0;
    
    public do0(final Context e0, final LinearLayout linearLayout, final a f0) {
        final ImageView[] c0 = new ImageView[5];
        (this.C0 = c0)[0] = (ImageView)((View)linearLayout).findViewById(2131430871);
        c0[1] = (ImageView)((View)linearLayout).findViewById(2131430872);
        c0[2] = (ImageView)((View)linearLayout).findViewById(2131430873);
        c0[3] = (ImageView)((View)linearLayout).findViewById(2131430874);
        c0[4] = (ImageView)((View)linearLayout).findViewById(2131430875);
        for (int i = 0; i < 5; ++i) {
            ((View)this.C0[i]).setOnClickListener((View$OnClickListener)this);
        }
        this.D0 = 0;
        this.F0 = f0;
        this.E0 = e0;
    }
    
    public final void onClick(final View view) {
        final int id = view.getId();
        final int n = 0;
        int d0;
        if (id == 2131430871) {
            d0 = 1;
        }
        else if (id == 2131430872) {
            d0 = 2;
        }
        else if (id == 2131430873) {
            d0 = 3;
        }
        else if (id == 2131430874) {
            d0 = 4;
        }
        else if (id == 2131430875) {
            d0 = 5;
        }
        else {
            d0 = 0;
        }
        if (d0 != 0) {
            for (int i = 0; i < 5; ++i) {
                ((View)this.C0[i]).setClickable(false);
            }
            this.D0 = d0;
            final Animation loadAnimation = AnimationUtils.loadAnimation(this.E0, 2130771985);
            for (int j = 0; j < d0; ++j) {
                this.C0[j].setImageResource(2131231070);
                ((View)this.C0[j]).setAnimation(loadAnimation);
            }
            final co0$a co0$a = (co0$a)this.F0;
            Objects.requireNonNull(co0$a);
            new Handler().postDelayed((Runnable)new bo0(co0$a, d0, 0), 200L);
            int n2;
            if (d0 != 1) {
                if (d0 != 2) {
                    if (d0 != 3) {
                        if (d0 != 4) {
                            if (d0 != 5) {
                                n2 = n;
                            }
                            else {
                                n2 = 10;
                            }
                        }
                        else {
                            n2 = 9;
                        }
                    }
                    else {
                        n2 = 8;
                    }
                }
                else {
                    n2 = 7;
                }
            }
            else {
                n2 = 6;
            }
            if (n2 != 0) {
                co0.a(n2);
            }
        }
    }
    
    public interface a
    {
    }
}
