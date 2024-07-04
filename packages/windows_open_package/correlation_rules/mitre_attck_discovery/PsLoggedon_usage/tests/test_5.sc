{"action":"bind","event_src.category":"Other","event_src.fqdn":"win10-work.stand2008.local","event_src.host":"win10-work.stand2008.local","event_src.hostname":"win10-work","event_src.rule":"-","event_src.subsys":"Microsoft-Windows-Sysmon/Operational","event_src.title":"sysmon","event_src.vendor":"microsoft","generator.type":"logcollector","generator.version":"N26.0.2936","id":"PT_Microsoft_Windows_eventlog_Sysmon_18_Pipe_connected","importance":"info","input_id":"00000000-0000-0000-0000-000000000000","mime":"application/x-pt-eventlog","msgid":"18","normalized":true,"object":"resource","object.name":"winreg","object.type":"pipe","recv_ipv4":"127.0.0.1","recv_time":"2024-07-04T15:14:31.952Z","status":"success","subject":"process","subject.account.domain":"nt authority","subject.account.id":"synthetic:система@nt authority","subject.account.name":"система","subject.process.fullpath":"system","subject.process.guid":"2b856446-3ee5-6686-eb03-000000000000","subject.process.id":"4","subject.process.name":"system","subject.process.path":"","tag":"some_tag","task_id":"00000000-0000-0000-0000-000000000000","taxonomy_version":"26.0.215-release-26.0","time":"2024-07-04T09:14:07.948Z","type":"raw","uuid":"c87e9ac5-3b8d-4f57-a1ee-f69700ff131b"}
{"action":"bind","event_src.category":"Other","event_src.fqdn":"win10-work.stand2008.local","event_src.host":"win10-work.stand2008.local","event_src.hostname":"win10-work","event_src.rule":"-","event_src.subsys":"Microsoft-Windows-Sysmon/Operational","event_src.title":"sysmon","event_src.vendor":"microsoft","generator.type":"logcollector","generator.version":"N26.0.2936","id":"PT_Microsoft_Windows_eventlog_Sysmon_18_Pipe_connected","importance":"info","input_id":"00000000-0000-0000-0000-000000000000","mime":"application/x-pt-eventlog","msgid":"18","normalized":true,"object":"resource","object.name":"lsarpc","object.type":"pipe","recv_ipv4":"127.0.0.1","recv_time":"2024-07-04T15:14:31.952Z","status":"success","subject":"process","subject.account.domain":"nt authority","subject.account.id":"synthetic:система@nt authority","subject.account.name":"система","subject.process.fullpath":"system","subject.process.guid":"2b856446-3ee5-6686-eb03-000000000000","subject.process.id":"4","subject.process.name":"system","subject.process.path":"","tag":"some_tag","task_id":"00000000-0000-0000-0000-000000000000","taxonomy_version":"26.0.215-release-26.0","time":"2024-07-04T09:14:07.948Z","type":"raw","uuid":"c87e9ac5-3b8d-4f57-a1ee-f69700ff1s1b"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 {"action":"bind","category.generic":"Attack","category.high":"Discovery","category.low":"System Owner/User Discovery","correlation_name":"PsLoggedon_usage","correlation_type":"incident","count":1,"event_src.category":"Other","event_src.fqdn":"win10-work.stand2008.local","event_src.host":"win10-work.stand2008.local","event_src.hostname":"win10-work","event_src.subsys":"Microsoft-Windows-Sysmon/Operational","event_src.title":"sysmon","event_src.vendor":"microsoft","generator.type":"correlationengine","importance":"high","incident.aggregation.key":"PsLoggedon_usage|win10-work.stand2008.local","incident.aggregation.timeout":7200,"incident.category":"SoftwareSuspiciousActivity","incident.severity":"high","normalized":true,"object":"resource","object.name":"lsarpc","object.type":"pipe","origin_app_id":"00000000-0000-0000-0000-000000000005","primary_siem_app_id":"00000000-0000-0000-0000-000000000005","reason":"winreg_lsarpc","status":"success","subject":"process","subject.account.domain":"nt authority","subject.account.id":"synthetic:система@nt authority","subject.account.name":"система","time":"2024-07-04T09:14:07.948Z"}