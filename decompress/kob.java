import androidx.viewpager2.adapter.FragmentStateAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kob implements Runnable
{
    public final FragmentStateAdapter D0;
    
    public kob(final FragmentStateAdapter d0) {
        this.D0 = d0;
    }
    
    @Override
    public final void run() {
        final FragmentStateAdapter d0 = this.D0;
        d0.M0 = false;
        d0.F();
    }
}
