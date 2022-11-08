// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@lpe
public class GroupInfoEditContentViewProvider$SavedState<OBJ extends GroupInfoEditContentViewProvider> extends dq1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new GroupInfoEditContentViewProvider$SavedState$a();
    }
    
    public GroupInfoEditContentViewProvider$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public GroupInfoEditContentViewProvider$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final elp elp, final OBJ obj) throws IOException, ClassNotFoundException {
        final GroupInfoEditContentViewProvider groupInfoEditContentViewProvider = (GroupInfoEditContentViewProvider)super.deserializeValue(elp, (Object)obj);
        groupInfoEditContentViewProvider.W0 = elp.u();
        groupInfoEditContentViewProvider.X0 = elp.u();
        groupInfoEditContentViewProvider.Y0 = elp.u();
        groupInfoEditContentViewProvider.Z0 = (ww9)((s4j)ww9.F0).a(elp);
        groupInfoEditContentViewProvider.a1 = elp.I();
        groupInfoEditContentViewProvider.b1 = elp.I();
        return (OBJ)groupInfoEditContentViewProvider;
    }
    
    public void serializeValue(final flp flp, final OBJ obj) throws IOException {
        super.serializeValue(flp, (Object)obj);
        flp.t(obj.W0);
        flp.t(obj.X0);
        flp.t(obj.Y0);
        flp.C((Object)obj.Z0, (alp)ww9.F0);
        flp.G(obj.a1);
        flp.G(obj.b1);
    }
}
