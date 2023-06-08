{"action": "clean", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Eventlog\",\"Guid\":\"{fc65ddd8-d6ef-4962-83d5-6e5cfe9ce148}\"},\"EventID\":\"104\",\"Version\":\"0\",\"Level\":\"4\",\"Task\":\"104\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2019-03-19T23:34:25.8943413Z\"},\"EventRecordID\":\"27736\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"812\",\"ThreadID\":\"3916\"},\"Channel\":\"System\",\"Computer\":\"PC01.example.corp\",\"Security\":{\"UserID\":\"S-1-5-21-1587066498-1489273250-1035260531-1106\"}},\"UserData\":{\"LogFileCleared\":{\"xmlns:auto-ns3\":\"3>http://schemas.microsoft.com/win/2004/08/events\",\"xmlns\":\"http://manifests.microsoft.com/win/2004/08/windows/eventlog\",\"SubjectUserName\":\"user01\",\"SubjectDomainName\":\"EXAMPLE\",\"Channel\":\"System\",\"BackupPath\":\"\"}}}}", "event_src.category": "Operating system", "event_src.fqdn": "pc01.example.corp", "event_src.host": "pc01.example.corp", "event_src.hostname": "pc01", "event_src.subsys": "System", "event_src.title": "windows", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Common_System_104_Log_was_cleared", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "104", "normalized": true, "object": "log", "object.name": "System", "object.property": "backup path", "object.value": "", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-01T11:11:22.781Z", "status": "success", "subject": "account", "subject.account.domain": "example", "subject.account.id": "S-1-5-21-1587066498-1489273250-1035260531-1106", "subject.account.name": "user01", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-03-19T23:34:25.894Z", "type": "raw", "uuid": "836bf47c-840f-416f-9fc5-042f340c47c7"}

expect 1 {"action": "clean", "alert.context": "example\\user01 clean System", "alert.key": "System", "category.generic": "Attack", "category.high": "Defense Evasion", "category.low": "Indicator Removal", "correlation_name": "Clearing_eventlog", "correlation_type": "incident", "event_src.fqdn": "pc01.example.corp", "event_src.host": "pc01.example.corp", "event_src.hostname": "pc01", "importance": "medium", "object": "log", "object.name": "System", "object.property": "backup path", "object.value": "", "status": "success", "subject": "account", "subject.account.domain": "example", "subject.account.id": "S-1-5-21-1587066498-1489273250-1035260531-1106", "subject.account.name": "user01"}