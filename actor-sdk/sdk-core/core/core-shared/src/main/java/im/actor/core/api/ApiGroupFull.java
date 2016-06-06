package im.actor.core.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.runtime.bser.*;
import im.actor.runtime.collections.*;
import static im.actor.runtime.bser.Utils.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.j2objc.annotations.ObjectiveCName;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ApiGroupFull extends BserObject {

    private int id;
    private long createDate;
    private int ownerUid;
    private List<ApiMember> members;
    private String theme;
    private String about;
    private ApiMapValue ext;
    private Boolean isAsyncMembers;
    private Boolean canViewMembers;
    private Boolean canInvitePeople;
    private Boolean isSharedHistory;

    public ApiGroupFull(int id, long createDate, int ownerUid, @NotNull List<ApiMember> members, @Nullable String theme, @Nullable String about, @Nullable ApiMapValue ext, @Nullable Boolean isAsyncMembers, @Nullable Boolean canViewMembers, @Nullable Boolean canInvitePeople, @Nullable Boolean isSharedHistory) {
        this.id = id;
        this.createDate = createDate;
        this.ownerUid = ownerUid;
        this.members = members;
        this.theme = theme;
        this.about = about;
        this.ext = ext;
        this.isAsyncMembers = isAsyncMembers;
        this.canViewMembers = canViewMembers;
        this.canInvitePeople = canInvitePeople;
        this.isSharedHistory = isSharedHistory;
    }

    public ApiGroupFull() {

    }

    public int getId() {
        return this.id;
    }

    public long getCreateDate() {
        return this.createDate;
    }

    public int getOwnerUid() {
        return this.ownerUid;
    }

    @NotNull
    public List<ApiMember> getMembers() {
        return this.members;
    }

    @Nullable
    public String getTheme() {
        return this.theme;
    }

    @Nullable
    public String getAbout() {
        return this.about;
    }

    @Nullable
    public ApiMapValue getExt() {
        return this.ext;
    }

    @Nullable
    public Boolean isAsyncMembers() {
        return this.isAsyncMembers;
    }

    @Nullable
    public Boolean canViewMembers() {
        return this.canViewMembers;
    }

    @Nullable
    public Boolean canInvitePeople() {
        return this.canInvitePeople;
    }

    @Nullable
    public Boolean isSharedHistory() {
        return this.isSharedHistory;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.id = values.getInt(1);
        this.createDate = values.getLong(6);
        this.ownerUid = values.getInt(5);
        List<ApiMember> _members = new ArrayList<ApiMember>();
        for (int i = 0; i < values.getRepeatedCount(12); i ++) {
            _members.add(new ApiMember());
        }
        this.members = values.getRepeatedObj(12, _members);
        this.theme = values.optString(2);
        this.about = values.optString(3);
        this.ext = values.optObj(7, new ApiMapValue());
        this.isAsyncMembers = values.optBool(11);
        this.canViewMembers = values.optBool(8);
        this.canInvitePeople = values.optBool(9);
        this.isSharedHistory = values.optBool(10);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeInt(1, this.id);
        writer.writeLong(6, this.createDate);
        writer.writeInt(5, this.ownerUid);
        writer.writeRepeatedObj(12, this.members);
        if (this.theme != null) {
            writer.writeString(2, this.theme);
        }
        if (this.about != null) {
            writer.writeString(3, this.about);
        }
        if (this.ext != null) {
            writer.writeObject(7, this.ext);
        }
        if (this.isAsyncMembers != null) {
            writer.writeBool(11, this.isAsyncMembers);
        }
        if (this.canViewMembers != null) {
            writer.writeBool(8, this.canViewMembers);
        }
        if (this.canInvitePeople != null) {
            writer.writeBool(9, this.canInvitePeople);
        }
        if (this.isSharedHistory != null) {
            writer.writeBool(10, this.isSharedHistory);
        }
    }

    @Override
    public String toString() {
        String res = "struct GroupFull{";
        res += "id=" + this.id;
        res += ", createDate=" + this.createDate;
        res += ", ownerUid=" + this.ownerUid;
        res += ", members=" + this.members;
        res += ", theme=" + this.theme;
        res += ", about=" + this.about;
        res += ", isAsyncMembers=" + this.isAsyncMembers;
        res += ", canViewMembers=" + this.canViewMembers;
        res += ", canInvitePeople=" + this.canInvitePeople;
        res += ", isSharedHistory=" + this.isSharedHistory;
        res += "}";
        return res;
    }

}
