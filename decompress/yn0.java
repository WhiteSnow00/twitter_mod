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

public final class yn0 implements View$OnClickListener
{
    public final ImageView[] D0;
    public int E0;
    public final Context F0;
    public final a G0;
    
    public yn0(final Context f0, final LinearLayout linearLayout, final a g0) {
        final ImageView[] d0 = new ImageView[5];
        (this.D0 = d0)[0] = (ImageView)((View)linearLayout).findViewById(2131430873);
        d0[1] = (ImageView)((View)linearLayout).findViewById(2131430874);
        d0[2] = (ImageView)((View)linearLayout).findViewById(2131430875);
        d0[3] = (ImageView)((View)linearLayout).findViewById(2131430876);
        d0[4] = (ImageView)((View)linearLayout).findViewById(2131430877);
        for (int i = 0; i < 5; ++i) {
            ((View)this.D0[i]).setOnClickListener((View$OnClickListener)this);
        }
        this.E0 = 0;
        this.G0 = g0;
        this.F0 = f0;
    }
    
    public final void onClick(final View view) {
        final int id = view.getId();
        final int n = 0;
        int e0;
        if (id == 2131430873) {
            e0 = 1;
        }
        else if (id == 2131430874) {
            e0 = 2;
        }
        else if (id == 2131430875) {
            e0 = 3;
        }
        else if (id == 2131430876) {
            e0 = 4;
        }
        else if (id == 2131430877) {
            e0 = 5;
        }
        else {
            e0 = 0;
        }
        if (e0 != 0) {
            for (int i = 0; i < 5; ++i) {
                ((View)this.D0[i]).setClickable(false);
            }
            this.E0 = e0;
            final Animation loadAnimation = AnimationUtils.loadAnimation(this.F0, 2130771985);
            for (int j = 0; j < e0; ++j) {
                this.D0[j].setImageResource(2131231070);
                ((View)this.D0[j]).setAnimation(loadAnimation);
            }
            final xn0$a xn0$a = (xn0$a)this.G0;
            Objects.requireNonNull(xn0$a);
            new Handler().postDelayed((Runnable)new wn0(xn0$a, e0), 200L);
            int n2;
            if (e0 != 1) {
                if (e0 != 2) {
                    if (e0 != 3) {
                        if (e0 != 4) {
                            if (e0 != 5) {
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
                xn0.a(n2);
            }
        }
    }
    
    public interface a
    {
    }
}
