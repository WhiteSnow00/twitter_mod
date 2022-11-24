// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit.editbirthdate;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@upe
public class EditBirthdateContentViewProvider$SavedState<OBJ extends EditBirthdateContentViewProvider> extends eq1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new EditBirthdateContentViewProvider$SavedState$a();
    }
    
    public EditBirthdateContentViewProvider$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public EditBirthdateContentViewProvider$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final rmp rmp, final OBJ obj) throws IOException, ClassNotFoundException {
        final EditBirthdateContentViewProvider editBirthdateContentViewProvider = (EditBirthdateContentViewProvider)super.deserializeValue(rmp, (Object)obj);
        editBirthdateContentViewProvider.Z0 = rmp.u();
        editBirthdateContentViewProvider.a1 = rmp.u();
        return (OBJ)editBirthdateContentViewProvider;
    }
    
    public /* bridge */ Object deserializeValue(final rmp rmp, final Object o) throws IOException, ClassNotFoundException {
        return this.deserializeValue(rmp, (EditBirthdateContentViewProvider)o);
    }
    
    public void serializeValue(final smp smp, final OBJ obj) throws IOException {
        super.serializeValue(smp, (Object)obj);
        smp.t(obj.Z0);
        smp.t(obj.a1);
    }
    
    public /* bridge */ void serializeValue(final smp smp, final Object o) throws IOException {
        this.serializeValue(smp, (EditBirthdateContentViewProvider)o);
    }
}
