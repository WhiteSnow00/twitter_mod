import android.view.ViewGroup;
import android.view.View;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Set;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qer
{
    public final vjo a;
    public final Context b;
    
    public qer(final vjo a, final Context b) {
        czd.f((Object)a, "roomsScribeReporter");
        czd.f((Object)b, "context");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final d4e<ser> d4e, final LinearLayoutManager linearLayoutManager, final Set<Integer> set) {
        czd.f((Object)set, "previouslyVisibleItems");
        final itd itd = new itd(linearLayoutManager.o1(), linearLayoutManager.s1());
        final ArrayList list = new ArrayList();
        final etd j = ((gtd)itd).j();
        while (((htd)j).F0) {
            final Object next = j.next();
            final int intValue = ((Number)next).intValue();
            if (intValue >= 0 && !set.contains(intValue)) {
                list.add(next);
            }
        }
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            vjo.F(this.a, "stations_tab", "card", "impression", null, ((ser$a)d4e.getItem(((Number)iterator.next()).intValue())).a.i, 8);
        }
        set.clear();
        set.addAll(mq4.R0((Iterable)itd));
    }
    
    public final void b(final q3e<? extends xbr> q3e, final RecyclerView recyclerView, final Set<Integer> set) {
        czd.f((Object)q3e, "itemCollectionProvider");
        czd.f((Object)set, "visibleItemPositions");
        final ai8 ai8 = (ai8)q3e;
        if (ai8.c()) {
            final n3e f = ai8.f();
            czd.e((Object)f, "itemCollectionProvider.items");
            final etd j = ((gtd)new itd(0, f.getSize())).j();
            while (((htd)j).F0) {
                final int a = j.a();
                final View child = ((ViewGroup)recyclerView).getChildAt(a);
                if (child != null) {
                    final int[] array = new int[2];
                    child.getLocationOnScreen(array);
                    if (this.b.getResources().getDisplayMetrics().heightPixels > array[1]) {
                        if (set.contains(a)) {
                            continue;
                        }
                        set.add(a);
                        final xbr xbr = (xbr)f.m(a);
                        if (xbr instanceof xbr$b) {
                            final r21 a2 = ((xbr$b)xbr).a;
                            final vjo a3 = this.a;
                            final String h = a2.h;
                            Objects.requireNonNull(a3);
                            vjo.F(a3, "stations_tab", "upcoming", "impression", u01.a(h), null, 16);
                        }
                        else {
                            if (!(xbr instanceof xbr$a)) {
                                continue;
                            }
                            final r21 a4 = ((xbr$a)xbr).a;
                            if (a4 == null) {
                                continue;
                            }
                            final vjo a5 = this.a;
                            final String h2 = a4.h;
                            Objects.requireNonNull(a5);
                            vjo.F(a5, "stations_tab", "spotlight", "impression", u01.a(h2), null, 16);
                        }
                    }
                    else {
                        set.remove(a);
                    }
                }
            }
        }
    }
}
