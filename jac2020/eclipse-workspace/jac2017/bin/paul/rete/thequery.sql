SELECT reteCondition.lhs AS lhs1, reteCondition.rhs AS rhs1, reteFact.lid AS lid1, reteFact.rid AS rid1, reteCondition_1.lhs AS lhs2, reteCondition_1.rhs AS rhs2, reteFact_1.lid AS lid2, reteFact_1.rid AS rid2, reteAmView.reteCondition.id, reteAmView.reteFact.id, reteAmView_1.reteCondition.id, reteAmView_1.reteFact.id

FROM (((((
reteProductionJoinView

LEFT JOIN reteAmView AS reteAmView_1 ON reteProductionJoinView.reteProduction_1.conditionId = reteAmView_1.reteCondition.id)
LEFT JOIN reteCondition AS reteCondition_1 ON reteAmView_1.reteCondition.id = reteCondition_1.id)
LEFT JOIN reteFact AS reteFact_1 ON reteAmView_1.reteFact.id = reteFact_1.id)

INNER JOIN reteAmView ON reteProductionJoinView.reteProduction.conditionId = reteAmView.reteCondition.id)
INNER JOIN reteCondition ON reteAmView.reteCondition.id = reteCondition.id)
INNER JOIN reteFact ON reteAmView.reteFact.id = reteFact.id

WHERE

((reteCondition.lhs = reteCondition_1.lhs AND reteFact.lid = reteFact_1.lid) OR
(reteCondition.lhs <> reteCondition_1.lhs AND reteFact.lid <> reteFact_1.lid))

AND

(reteCondition_1.rhs is Null AND reteFact_1.rid is Null OR
(reteCondition_1.rhs is not Null AND reteFact_1.rid is not Null AND
((reteCondition.lhs = reteCondition_1.rhs AND reteFact.lid = reteFact_1.rid) OR
(reteCondition.lhs <> reteCondition_1.rhs AND reteFact.lid <> reteFact_1.rid))))

AND

(((reteCondition.rhs is Null AND reteCondition_1.rhs is Null AND reteFact.rid is Null and reteFact_1.rid is Null) OR
(reteCondition.rhs is Null AND reteCondition_1.rhs is not Null AND reteFact.rid is Null and reteFact_1.rid is not Null) OR
(reteCondition.rhs is not Null AND reteCondition_1.rhs is Null AND reteFact.rid is not Null and reteFact_1.rid is Null)) OR
((reteCondition.rhs = reteCondition_1.rhs AND reteFact.rid = reteFact_1.rid) OR
(reteCondition.rhs <> reteCondition_1.rhs AND reteFact.rid <> reteFact_1.rid)))

AND

(reteCondition.rhs is Null AND reteFact.rid is Null OR
(reteCondition.rhs is not Null AND reteFact.rid is not Null AND
((reteCondition.rhs = reteCondition_1.lhs AND reteFact.rid = reteFact_1.lid) OR
(reteCondition.rhs <> reteCondition_1.lhs AND reteFact.rid <> reteFact_1.lid))))


ORDER BY reteAmView.reteCondition.id, reteAmView_1.reteCondition.id;
