import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collection;
import java.util.Objects;
import com.twitter.rooms.ui.utils.endscreen.RoomEndScreenViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.ui.utils.endscreen.RoomEndScreenViewModel$fetchAudioSpace$1", f = "RoomEndScreenViewModel.kt", l = {}, m = "invokeSuspend")
public final class lhn extends p0s implements ftb<lvj<? extends r21, ? extends t21>, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomEndScreenViewModel E0;
    
    public lhn(final RoomEndScreenViewModel e0, final go6<? super lhn> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final lhn lhn = new lhn(this.E0, (go6<? super lhn>)go6);
        lhn.D0 = d0;
        return (go6<fzv>)lhn;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final lhn lhn = (lhn)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        lhn.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final lvj lvj = (lvj)this.D0;
        final RoomEndScreenViewModel e0 = this.E0;
        final r21 r21 = (r21)lvj.D0;
        final t21 t21 = (t21)lvj.E0;
        final RoomEndScreenViewModel.c companion = RoomEndScreenViewModel.Companion;
        Objects.requireNonNull(e0);
        czd.f((Object)r21, "audioSpace");
        final ds5 y = r21.Y;
        Object b;
        if (y != null) {
            b = y.b;
        }
        else {
            b = null;
        }
        tg5 b2;
        if (b instanceof bs5$a) {
            b2 = ((bs5$a)b).b;
        }
        else {
            b2 = null;
        }
        Object o2;
        if (b2 != null) {
            o2 = s9i.s((w0r)new w0r$b(2131958245), (w0r)new w0r$a(b2));
        }
        else {
            o2 = f2a.D0;
        }
        if (djo.t()) {
            final List x0 = mq4.x0((Collection)t21.a, (Iterable)t21.b);
            final HashSet<String> set = new HashSet<String>();
            final ArrayList<s21> list = new ArrayList<s21>();
            for (final Object next : (ArrayList)x0) {
                if (set.add(((s21)next).d())) {
                    list.add((s21)next);
                }
            }
            final ArrayList<s21> list2 = new ArrayList<s21>();
            for (final s21 next2 : list) {
                if (next2.e() != null) {
                    list2.add(next2);
                }
            }
            final ArrayList list3 = new ArrayList<Long>(iq4.H((Iterable)list2, 10));
            final Iterator<s21> iterator3 = list2.iterator();
            while (iterator3.hasNext()) {
                final cgv e2 = iterator3.next().e();
                Long value;
                if (e2 != null) {
                    value = e2.D0;
                }
                else {
                    value = null;
                }
                list3.add(value);
            }
            e0.C(e0.T0.a((List<Long>)list3).first((Object)f2a.D0).w((psb)new cyn((qsb)nhn.D0, 14)).p((psb)new hpn((qsb)new ohn(t21), 17)), (qsb)new shn(e0, (List<? extends w0r>)o2, b2, t21));
        }
        else {
            e0.Q((qsb)new thn((List)o2, t21, b2));
        }
        e0.Q((qsb)new phn(e0, r21));
        return fzv.a;
    }
}
