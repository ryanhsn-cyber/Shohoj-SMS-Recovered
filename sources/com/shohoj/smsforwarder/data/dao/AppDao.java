package com.shohoj.smsforwarder.data.dao;

import androidx.core.app.NotificationCompat;
import com.shohoj.smsforwarder.data.entities.ConnectedSiteEntity;
import com.shohoj.smsforwarder.data.entities.LogEntity;
import com.shohoj.smsforwarder.data.entities.ProjectEntity;
import com.shohoj.smsforwarder.data.entities.RuleEntity;
import com.shohoj.smsforwarder.data.entities.SenderEntity;
import com.shohoj.smsforwarder.data.entities.TransactionEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: AppDao.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001e\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000bH'J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000bH'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000bH'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u000bH'J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\f0\u000bH'J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001a\u001a\u00020\u001bH§@¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\f0\u000b2\u0006\u0010 \u001a\u00020\u0005H'J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\f0\u000b2\u0006\u0010\"\u001a\u00020\u001bH'J\u0016\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\rH§@¢\u0006\u0002\u0010%J\u0016\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u000fH§@¢\u0006\u0002\u0010(J\u0016\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H§@¢\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0013H§@¢\u0006\u0002\u0010.J\u0016\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0015H§@¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0017H§@¢\u0006\u0002\u00104J\u0016\u00105\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H§@¢\u0006\u0002\u0010+J\u0016\u00106\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0013H§@¢\u0006\u0002\u0010.J\u0016\u00107\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0015H§@¢\u0006\u0002\u00101J\u0016\u00108\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0017H§@¢\u0006\u0002\u00104¨\u00069"}, d2 = {"Lcom/shohoj/smsforwarder/data/dao/AppDao;", "", "deleteConnectedSiteById", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteProjectById", "deleteRuleById", "deleteSenderById", "getAllConnectedSites", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/shohoj/smsforwarder/data/entities/ConnectedSiteEntity;", "getAllLogs", "Lcom/shohoj/smsforwarder/data/entities/LogEntity;", "getAllProjects", "Lcom/shohoj/smsforwarder/data/entities/ProjectEntity;", "getAllRules", "Lcom/shohoj/smsforwarder/data/entities/RuleEntity;", "getAllSenders", "Lcom/shohoj/smsforwarder/data/entities/SenderEntity;", "getAllTransactions", "Lcom/shohoj/smsforwarder/data/entities/TransactionEntity;", "getProjectById", "getProjectByReference", "keyword", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRuleById", "getSenderById", "getTransactionsByProjectId", "projectId", "getTransactionsByStatus", NotificationCompat.CATEGORY_STATUS, "insertConnectedSite", "site", "(Lcom/shohoj/smsforwarder/data/entities/ConnectedSiteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertLog", "log", "(Lcom/shohoj/smsforwarder/data/entities/LogEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertProject", "project", "(Lcom/shohoj/smsforwarder/data/entities/ProjectEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRule", "rule", "(Lcom/shohoj/smsforwarder/data/entities/RuleEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSender", "sender", "(Lcom/shohoj/smsforwarder/data/entities/SenderEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTransaction", "transaction", "(Lcom/shohoj/smsforwarder/data/entities/TransactionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProject", "updateRule", "updateSender", "updateTransaction", "app_debug"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AppDao {
    Object deleteConnectedSiteById(int i, Continuation<? super Unit> continuation);

    Object deleteProjectById(int i, Continuation<? super Unit> continuation);

    Object deleteRuleById(int i, Continuation<? super Unit> continuation);

    Object deleteSenderById(int i, Continuation<? super Unit> continuation);

    Flow<List<ConnectedSiteEntity>> getAllConnectedSites();

    Flow<List<LogEntity>> getAllLogs();

    Flow<List<ProjectEntity>> getAllProjects();

    Flow<List<RuleEntity>> getAllRules();

    Flow<List<SenderEntity>> getAllSenders();

    Flow<List<TransactionEntity>> getAllTransactions();

    Object getProjectById(int i, Continuation<? super ProjectEntity> continuation);

    Object getProjectByReference(String str, Continuation<? super ProjectEntity> continuation);

    Object getRuleById(int i, Continuation<? super RuleEntity> continuation);

    Object getSenderById(int i, Continuation<? super SenderEntity> continuation);

    Flow<List<TransactionEntity>> getTransactionsByProjectId(int projectId);

    Flow<List<TransactionEntity>> getTransactionsByStatus(String status);

    Object insertConnectedSite(ConnectedSiteEntity connectedSiteEntity, Continuation<? super Unit> continuation);

    Object insertLog(LogEntity logEntity, Continuation<? super Unit> continuation);

    Object insertProject(ProjectEntity projectEntity, Continuation<? super Unit> continuation);

    Object insertRule(RuleEntity ruleEntity, Continuation<? super Unit> continuation);

    Object insertSender(SenderEntity senderEntity, Continuation<? super Unit> continuation);

    Object insertTransaction(TransactionEntity transactionEntity, Continuation<? super Unit> continuation);

    Object updateProject(ProjectEntity projectEntity, Continuation<? super Unit> continuation);

    Object updateRule(RuleEntity ruleEntity, Continuation<? super Unit> continuation);

    Object updateSender(SenderEntity senderEntity, Continuation<? super Unit> continuation);

    Object updateTransaction(TransactionEntity transactionEntity, Continuation<? super Unit> continuation);
}
